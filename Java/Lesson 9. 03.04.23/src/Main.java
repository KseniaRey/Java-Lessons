/*
 * __________________________________==================================____________________________________
 *
 * __________________________________==================================____________________________________
План занятия
1.
2.
 */

/*
 * Теория
 * Оператор - управляющая команда для компьютера (+ - и тд. также --> return и break )
 * Условный оператор if (логическое условие) - оператор для сравнения чего-либо
 * else --> в ином случае, выполняется, если if не отработал
 *      Конструкция:
         * if(condition){
         * то, что будет выполнено, если условие истинно
         * }
         * else {
         * то, что будет выполнено, если условие ложно
         * }
         *
 * Также есть вариант проверки нескольких условий:
 *          * if(condition){
            * то, что будет выполнено, если условие истинно
            * }
            * else if {
            * то, что будет выполнено, если первое условие ложно
            * }
            * else {
            * то, что будет выполнено, если  условие ложно
            * }
 * __________________________________==================================____________________________________
 *
 * __________________________________==================================____________________________________

 */
/*
 * Заметки
 * В условных операторах всегда проверяется логическое выражение
 */

/*
* Задачи:
* 1) *Создать класс Human с полями рост, вес, пол, возраст. Создать массив Humans. Вывести только те объекты, которые
* имеют возраст больше 18 и вес меньше 80, если возраст меньше 18, вывести пол объекта.
* 2) Реализовать чтение целых чисел из консоли, если число больше или равно 18, вывести текст "Проходите"
* */


import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { // Точка входа (отсюда начинается и тут заканчивается код)
        // Код, который будет исполняться
        // Код читается сверху вниз
//        System.out.println("Введите возраст");
//        int age = sc.nextInt();
//        checkAge(age);

        System.out.println("Введите ваш вес: ");
        int weight = sc.nextInt();
        checkWeight(weight);
        countLength();
        checkWeight2();
//        System.out.println("Введите ваше слово: ");

        shareWord();

        humanAge();
//        till18();
//        till40();
//        after40();



    }

    // Методы класса
    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Проход запрещен");
        } else {
            System.out.println("Проходите");
        }
    }

    public static void checkWeight(int weight) {
        if (weight < 80) {
            System.out.println("Добро пожаловать на водные горки!");
        } else {
            System.out.println("К сожалению горка не рассчитана на вес больше 80");
        }
    }

    public static void countLength() {
        System.out.println("Введите слово: ");
        String word = sc.next();                                     // Считываем слово
        System.out.println("Длина слова: " + word.length());         // Выводим длину слова
    }

    public static void checkAge2() {


        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Проход запрещен");
        } else {
            System.out.println("Проходите");
        }

    }

    public static void checkWeight2(){
        int weight2 = sc.nextInt();
        if (weight2 < 100){
            System.out.println("Добро пожаловать на водные горки!");
        } else {
            System.out.println("К сожалению горка не рассчитана на вес больше 80");
        }
    }
// Задача 1
    public static void shareWord(){
        System.out.println("Введите второе слово: ");
        String word2 = sc.next();
        word2 = word2.toUpperCase();
        System.out.println("Слово в верхнем регистре: " + word2.toUpperCase());

    }

//    public static void startCalculation(){
//        System.out.println("Введите знак: ");
//        char sign = sc.next() .charAt(0);
//        if(sign == '+'){
//            sum();
//        }
//        else if(sign == '/'){
//            div();
//        }
//        else if(sign == '*'){
//            mul();
//        }
////        else (sign == '-'){
////            sub();
////        }
//    }
//    public static void mul() {
//        System.out.println("Введите первое число ");
//        int a = sc.nextInt();
//        System.out.println("Введите второе число ");
//        int b = sc.nextInt();
//        int mul = a * b;
//        System.out.println("Mul" + mul);
//
//    }
//
//    public static void sum() {
//        System.out.println("Введите первое число ");
//        int c = sc.nextInt();
//        System.out.println("Введите второе число ");
//        int d = sc.nextInt();
//        int sum = c + d;
//        System.out.println("Mul" + sum);
//    }
//
//    public static void div() {
//        System.out.println("Введите первое число ");
//        int e = sc.nextInt();
//        System.out.println("Введите второе число ");
//        int f = sc.nextInt();
//        int div = e / f;
//        System.out.println("Div" + div);
//    }

//    public static void sub() {
//        System.out.println("Введите первое число ");
//        int g = sc.nextInt();
//        System.out.println("Введите второе число ");
//        int t = sc.nextInt();
//        int sub = g - t;
//        System.out.println("Sub " + sub);
//    }
//    Самостоятельная задача:
    // Создать метод с запрашиванием возраста.
    //Создать еще 3 метода для возрастных групп: до 18, до 40, от 40
    // В 1м методе спросить, в какие игры играет человек. Во втором стпросить, сколько человек зарабатывает. В третьем спросить
    // есть ли у человека автомобиль.

    public static void humanAge(){
        System.out.println("Введите ваш возраст: ");
        int yourAge = sc.nextInt();
        if(yourAge < 18){
            till18();
        } else if(yourAge > 18 && yourAge < 40) {
            till40();
        } else {
            after40();
        }
    }

    public static void till18(){
        System.out.println("В какие игры вы играете?");
        String gameStr = sc.next();
    }

    public static void till40(){
        System.out.println("Сколько вы зарабатываете?");
        int salary = sc.nextInt();
    }

    public static void after40(){
        System.out.println("Есть ли автомобиль?");
        boolean auto = sc.nextBoolean();
    }

    // Домашнее задание:
    // Сделать калькулятор, добавить рассчет квадратного корня и возведения в степень (класс Math)
}
