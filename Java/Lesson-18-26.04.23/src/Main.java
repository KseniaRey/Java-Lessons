public class Main {

    /*План занятия
    * 1. Реализация распределения колоды карт
    * 2. Повторение*/

    /*Теория
    *Нужно запрограммировать колоду карт
    * - Карта имеет масть и достоинство
    * - Создадим шаблон для карты(класс) и добавим в него основные атрибуты для карты: масть, достоинство, старшинство(ранг)
    * чтобы определить, какая карта какую будет бить.
    * - На основании этого шаблона (класса) можно создать конкретный экземпляр карты (объект) и заполнить ими колоду:
    * - Создадим колоду карт для игры в 66: нам понадобится тузы, короли, дамы, валеты, десятки, девятки. Каждая карта
    * имеет 4 варианта масти, таким образом всего будет 24 карты.
    * Создадим массив типа Card и заполним его нужными объектами(картами)
    * Card[] cards = new Card[24];
    * */
    /*Заметки:
    * Показать ход исполнения программы позволяет ТРАССИРОВКА. Выводит на консоль*/
    /**/
    /**/
    public static void main(String[] args) {
        Card[] cards = new Card[24];  // создаем массив для хранения карт
        String[] suits = {"Бубны", "Черви", "Крести", "Пики"}; // массив для мастей

        int count = 0;  // счетчик для мастей
        int countValue = 0; // счетчик для достоинств
        String[] values = {"Девятка", "Десятка", "Валет", "Дама", "Король", "Туз"}; // массив достоинств
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
        System.out.println("Колода карт: " );
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].toString());
        }
    }
}