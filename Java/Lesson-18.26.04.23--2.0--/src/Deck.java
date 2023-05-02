import java.util.Random;

public class Deck {
    private Card[] cards = new Card[24];  // создаем массив для хранения карт
    private String[] suits = {"Бубны", "Черви", "Крести", "Пики"}; // массив для мастей

    private int count = 0;  // счетчик для мастей
    private int countValue = 0; // счетчик для достоинств
    private String[] values = {"Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"}; // массив достоинств
    private Random random = new Random();  // генератор позиции для раздачи колоды
    private int[] positions = new int[24]; // массив, в кот будем запоминать карту, кот выдали
    private Card[] player1 = new Card[6];  // массив для карт игрока 1
    private Card[] player2 = new Card[6];   // массив для карт игрока 2

    public void generateDeck(){
        for (int i = 0; i < cards.length; i++) {  // цикл для заполнения колоды
            if (count == 0){ // в каждом ифе проверяем  какой счетчик масти и достоинства
                cards[i] = new Card(suits[count], values[countValue]);
                System.out.println("Генерируем: " + suits[count] + values[countValue]);
                count++;
            } else if (count == 1) {
                cards[i] = new Card(suits[count], values[countValue]);
                System.out.println("Генерируем: " + suits[count] + values[countValue]);
                count++;
            } else if (count == 2) {
                cards[i] = new Card(suits[count], values[countValue]);
                System.out.println("Генерируем: " + suits[count] + values[countValue]);
                count++;
            } else if (count == 3) {
                cards[i] = new Card(suits[count], values[countValue]);
                System.out.println("Генерируем: " + suits[count] + values[countValue]);
                count = 0;
                countValue++;           // Увеличиваем только после 4 пройденных, потому что 4 девятки, 4 десятки и тд
            }

        }
    }
    public void distributeCards(){
        for (int i = 0; i < 6; i++) {
        int pos = random.nextInt(24);  // выбор 1 карты из колоды
        while (positions[pos] != 0){  // пока не найдем пустое значение (индекс сгенерированной карты), продолжаем генерировать значение
            pos = random.nextInt(24);
        }
            positions[pos] = pos; // после того, как в цикле нашли уникальную, еще не использовавшуюся ранее карту,  добавляем ее в массив 1 игрока и учитываем ее как уже выданную
            player1[i] = cards[pos];
        }
        // повторяем для второго игрока
        for (int i = 0; i < 6; i++) {
            int pos = random.nextInt(24);  // выбор 1 карты из колоды
            while (positions[pos] != 0){  // пока не найдем пустое значение (индекс сгенерированной карты), продолжаем генерировать значение
                pos = random.nextInt(24);
            }
            positions[pos] = pos; // после того, как в цикле нашли уникальную, еще не использовавшуюся ранее карту,  добавляем ее в массив 1 игрока и учитываем ее как уже выданную
            player2[i] = cards[pos];
            cards[pos] = null;      // удаляем каруту из колоды
        }
    }
    public void display(){
        System.out.println("Колода карт: " );
        for (int i = 0; i < cards.length; i++) {
            if (cards[i] == null){
                System.out.println("Null");     // если ссылка равна null, то есть, карты нет, выведи сообщение
            }else {
                System.out.println(cards[i].toString()); // в противном случае выводи элемент
            }
        }

    }

    public Card[] getPlayer1() {  // геттеры для игроков, чтобы посмотреть их колоды
        return player1;
    }

    public Card[] getPlayer2() {
        return player2;
    }
}
