import java.util.Scanner;

public class GameHandling {

    public GameHandling(){
        while (true) {
        handleGame();   // тут запускается управление игрой
        }
    }
    public static void handleGame(){
        System.out.println("Выберите действие:\n " +
                "1 - играть\n" +
                "2 - сжульничать\n" +
                "3 - выйти");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Lottery lottery = new Lottery();                            // Создаем объект класса Lottery
        lottery.generateWinCombination(10);                   // Создаем выигрышную комбинацию --> Тут с МАЛЕНЬКОЙ БУКВЫ!
        if(choice == 1){
            performGame(lottery);
        } else if (choice == 2) {
            cheat(lottery);
            performGame(lottery);
        } else {
            System.exit(0);                                     // Выход из программы со статусом завершения 0
        }

    }

    public static void cheat(Lottery lottery) {
        lottery.cheat();
    }

    public static void performGame(Lottery lottery){
        lottery.userCombination();                                  // Приглашаем пользователя ввести комбинацию
        lottery.checkCombination();                                 // Проверяем комбинацию
        /**
         * Следующий метод интовый, поэтому вызываем его через создание
         * интовой переменной. Запоминаем значение в интовую переменную и используем
         */
        int res = lottery.guessedPosition();                        // Получаем кол-во угаданных позиций
        System.out.println("Количество угаданных позиций: " + res); // Выводим то, что угадали
        lottery.cheat();
    }
}
