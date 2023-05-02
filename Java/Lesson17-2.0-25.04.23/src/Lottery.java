import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private Scanner scan = new Scanner(System.in);                              // Поля класса
    private Random rand = new Random();
    private int[] winArray = new int[5];
    private int[] userArray = new int[5];
    private int bound; // общая граница для компьютера и человека, задаем диапазон обоим
    private int countPositions = 0;
    private int countNumbers = 0; // декларация переменной для подсчета угаданных чисел

    /**
     * Метод для генерации выигрышной комбинации
     * @param bound диапазон чисел в комбинации
     */
    public void generateWinCombination(int bound){
        for (int i = 0; i < winArray.length; i++) {
            winArray[i] = rand.nextInt(bound); // запуш в каждый эл массива рандомное значение в опр диапазоне
        }
        this.bound = bound;                     // this.bound ссылается на поле класса bound и присваивает ему локальную переменную bound
    }

    /**
     * Ввод комбинации пользователя
     */
    public void userCombination(){
        System.out.println("Введите 5 чисел в диапазоне от 0 до " + bound);
        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = scan.nextInt();
        }
    }

    /**
     * Метод для проверки комбинации пользователя
     */
    public void checkCombination(){
        for (int i = 0; i < winArray.length; i++) {
            if(winArray[i] == userArray[i]){
                countPositions++;
            }
        }
    }

    /**
     * Метод для чита, возможность сжульничать
     * Проверка выигрышной комбинации
     */
    public void cheat(){
        for (int i = 0; i < winArray.length; i++) {
            System.out.println(winArray[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для возвращения числа угаданных позиций(индексов)
     * @return количество угаданных позиций
     */
    public int guessedPosition(){
        return countPositions;
    }

    /**
     * Метод для сравнивания + сортировка
     * @return подсчет угаданных чисел
     * @problem-is: Логика такая: мы проверяем вложенным циклом каждый элемент обоих массивов и сравниваем с каждым.
     * @int-count: Переменную мы создаем для того, чтобы исключить засчитывание одного и того же элемента дважды
     * Именно поэтому внизу count мы обнуляем. В цикле if у нас условие: если индекс вин и индекс юзер равны, и count равен 0,
     * то делай свои дела дальше. Но идея в том, что после первой итерации у нас каунт не будет 0. Поэтому в конце
     * цикла мы его обнуляем.
     */
    public int getCountNumbers(){
        //int count = 0;
        for (int i = 0; i < winArray.length; i++) {
            System.out.println("winArr[ " + i + "] = " + winArray[i]);
            for (int j = 0; j < userArray.length; j++) {
                System.out.println("winArr[ " + j + "] = " + userArray[j]);
                // ниже: сравниваем элементы массива
                if (winArray[i] == userArray[j]){   // if (winArray[i] == userArray[j] && count == 0){
                    countNumbers++;         // если они равны, учитыаем угаданное число
                    break;                  // завершаем цикл
                    //count++;
//                    System.out.println("count: " + count);
                }
            }
            System.out.println();           // Переходим на новую строку
            //count = 0;
        }
        return countNumbers;                // возвращаем кол-во угаданных чисел
    }

}
