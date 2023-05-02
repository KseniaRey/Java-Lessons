import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

//import java.util.Random;
public class Main {

      /*
    План занятия
    1) do-while цикл
    2) Повторение
    3)
     */

    /*
    Теория
    Условные операторы и циклы:
    Условные операторы if-else нужны для управления ходом исполнения программы.

    do-while - цикл с предусловием, т.е будет исполнен хотя бы 1 раз. В любом случае будет иметь хотя бы 1 итерацию (шаг
    цикла).
    do{
    действие
    }
    while(условие);

    условие работы любого цикла - true, завершения - false;
    управляет циклом логическое выражение
    //-------------------------
    Ссылочные типы против примитивных - метод equals();
    Примитивные типы мы сравниваем через == оператор логического сравнения. В примитивных типах с его помощью мы
    сравниваем значения переменных. Со ссылочными типами это не сработает, так как они хранят не значение, а ссылку.
    Поэтому для сравнения ссылочных мы используем метод equals();
     */

    /*
    Заметки
    Заключение:
    SOLID --> аббревиатура, которя указывает на правильные принципы программирования. Одним из них является
    антипаттерн "Божественный метод", выполняющий более 1 задачи. Правильно делать метод, который выполняет всего 1 задачу.
    Правило:
    1 задача - 1 метод.
    Это делается для достижения гибкости и читаемости кода.
     */

    /*
    * Задачи со звездочкой:
    * 1. Камень-ножницы-бумага, реализовать через класс с возможностью выбора режима игры
    * 2. Реализовать классы для работы со списками (односвязные и двусвязные) и массивом вывести контракт на эти классы
    * в абстрактный базовый класс: вставка, вставка по позиции, удаление элемента, удаление всей структуры, стирание
    * всей структуры, хранить размер структуры, предусмотреть наличие возможности вывода всей инициализированной структуры
    * и поиск элемента.  --> можно на каникулы
    * 3. Создать класс Account для банковского счета для обеспечения банковских операций
    * */
//    static Scanner scan = new Scanner(System.in);             // Считывание переменных из консоли
//    static Random random = new Random();                      // Создаем объект для генерации случайных чисел

    public static String checkWinner(String comp, String human){         // Почему мы это пишем не в методе main?
        String res = "";                                                 // Результат проверки
        if(comp.equals("Ножницы") && human.equals("Бумага")){            // Проверяем результат и записываем его в переменную res
            res = "Победа компьютера";
        }
        else if(comp.equals("Ножницы") && human.equals("Камень")){
            res = "Победа человека";
        }
        else if(comp.equals("Бумага") && human.equals("Камень")){
            res = "Победа компьютера";
        }
        else if(comp.equals("Бумага") && human.equals("Ножницы")){
            res = "Победа человека";
        }
        else if(comp.equals("Камень") && human.equals("Ножницы")){
            res = "Победа компьютера";
        }
        else if(comp.equals("Камень") && human.equals("Бумага")){
            res = "Победа человека";
        }
        else {
            res = "Ничья";
        }
        return res;                                                      // Возвращаем результат


    }
    /* TODO
    *   Реализовать многорежимную игру Камень-Ножницы-Бумага.
    *   Решение:
    *   1. Определить режим игры и дать возможность пользователю корректно выйти из приложения*/
        public static void game(){
        String player1 = "";
        String player2 = "";
        String winner = "";
        while (true){
//            player1 = userInput();
//            player2 = userInput();
//            winner = checkWinner(player1, player2);
//            System.out.println("Player1: " + player1 + "Player2: " + player2 + winner);
            switch (chooseMode()){
                case 1:
                    compVScomp();
                    break;
                case 2:
                    humanVShuman();
                    break;
                case 3:
                    humanVScomp();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Выберите режим заново: ");
            }

        }
        }

        public static void compVScomp(){
            String player1 = generateComp();
            String player2 = generateComp();
            String winner = checkWinner(player1, player2);
            displayWinner(player1, player2, winner);
        }

    public static void humanVScomp(){
            String player1 = userInput();
            String player2 = generateComp();
            String winner = checkWinner(player1, player2);
            displayWinner(player1, player2, winner);
    }
    public static String generateComp(){
        Random random = new Random();
        int rand = random.nextInt(3) + 1;
        String res;
        if(rand == 1){
            res = "Камень";
        } else if (rand == 2){
            res = "Ножницы";

        } else {
            res = "Бумага";
        }
        return res;
    }
    public static void humanVShuman(){
        String player1 = userInput();
        String player2 = userInput();
        String winner = checkWinner(player1, player2);
        displayWinner(player1, player2, winner);
    }

    public static void displayWinner(String player1, String player2, String winner){
        System.out.println("Player1: " + player1 + " Player2: " + player2 + " Результат: " + winner);
    }


    public static int chooseMode(){
            System.out.println("Выберите режим: \n" +
                    "1 - Игра компьютера с компьютером \n" +
                    "2 - Игра человека с человеком \n" +
                    "3 - Игра человека с компьютером \n" +
                    "4 - Выход");
            int mode = scan.nextInt();
            return mode;


    }

    /**
     * Метод для ввода ходов пользователя
     * @return ход пользователя
     */
    public static String userInput(){
        String input = "";                                  // Декларировали локальную переменную и инициализировали ее пустой строкой
        while (true) {                                      // Запуск цикла, в кот будем проверять правильность ввода
            System.out.println("Введите свой ход: ");       // Пришлашение ввести ход пользователя
            input = scan.next();                            // Считываем ответ сканнером
            if (checkInput(input)){                         // Проверяем правильный ли ввод, если нет, продолжаем
                break;                                      // Если да, прекращаем цикл
            }
        }
        return input;                                       // Возвращаем ответ
    }

    public static boolean checkInput(String input){  // Для того, чтобы снизить чувствительность регистра - Ножницы
        String move = input.toLowerCase();  // Декларируем переменную и переводим заданное значение в нижний регистр
        if(move.equals("ножницы") || move.equals("камень") || move.equals("бумага")){ // проверяем, правильный ли ввод
            return true;            // если да, то возвращаем true
        }
        return false;               // если нет, то возвращаем false
    }



    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Задачи от 06.04 вывести числа от 1 до 10
        int i = 0;                  // declare local variable - iterator of cycle while
        while (i<=10){              // declare while cycle w condition i <= 10;
        System.out.println(i);      // Выводим итератор цикла
        i++;                        // Инкрементируем (+1) итератор цикла
        }

        // Решение задачи с помощью for
        for (int j = 1; j <= 10; j++){      // объявили цикл for с итератором j (обычно тут i) и шагом в 1(инкремент)
            System.out.println(j);          // выводим в консоль итератор j
        }

        // Задача: вне зависимости от условия цикла вывести на консоль "Привет"
        do {                                // Данный цикл сначала делает, потом думает, поэтому даже если условие false, условие выполнится хотя бы 1 раз
            System.out.println("Hello");
        } while (false);                    // Условие цикла - false, работать он не должен

        // Задача:

        /*
        * Пример, когда это может пригодиться:
        * В Андроид за запись в локальную базу данных отвечает курсор (cursor - переменная), если записей нет,
        * то она равна 0, поэтому работать с БД нельзя, она пустая. Но чтобы получить доступ к курсору, нужно открыть
        * БД. В таком случае будет удобен цикл do-while --> сначала открыть БД, а затем проверить, есть ли смысл
        * перебирать записи в ней, если курсор не равен 0, то продолжить р-ту цикла.
        * */
        game();
    }


    /**
     * Метод для генерации хода компьютера
     * @return ход компьютера
     */
//Task w game 5.04//    public static String makeCompStep(){
//        int rand = random.nextInt(3) + 1;                          // Генерирует число в диапазоне от 1 до 3
//        String response = "";                                            // Создаем строчную переменную для хода компьютера
//        if(rand == 1){                                                   // В зависимости от числа присваиваем ход компьютера
//            response = "Камень";
//        }
//        else if(rand == 2){
//            response = "Бумага";
//        }
//        else {
//            response = "Ножницы";
//        }
//        return response;                                                 // Возвращаем ответ - ход компьюетра
//    }
}