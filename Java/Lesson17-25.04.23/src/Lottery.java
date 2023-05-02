import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private Scanner scan = new Scanner(System.in);                              // Поля класса
    private Random rand = new Random();
    private int[] winArray = new int[5];
    private int[] userArray = new int[5];
    private int bound; // общая граница для компьютера и человека, задаем диапазон обоим
    private int countPositions = 0;

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

}
