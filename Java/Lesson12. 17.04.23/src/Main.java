/*
* План
* Массивы
* Повторение
* */

/*
Теория
Массив - структура данных (способ хранения данных), кот может быть любого типа, любого размера, дающая доступ
к элементу по его индексу. То есть, у каждого значения есть его номер и по этому номеру можно получить значение или
изменить его. Проще всего представить в виде камеры хранения в супермаркете, где номер ключа это индекс ячейки, где
лежат наши вещи.

* Объявление массива:
* тип переменная = new тип[размер];
* int[] array = new int[10]; --> creating a new array with 10 elements.
* */

/*
* Заметки
* Структура данных всегда подразумевает некий алгоритм работы с собой. Существует большое кол-во базовых структур и
* алгоритмов. Нужно хорошо изучить, потому что на собеседовании значительно повысит наши шансы. Кроме того, можно
* будет понимая алгоритм пользоваться и другими яз программирования.
*
*[] --> square braskets tells us this is an array.
*
* Память бывает постоянная и оперативная. Оперативная память это то, с чем работают программы.
*
* При создании массива в программе хранится адрес первого элемента. Таким образом, чтобы найти адрес любого элемента
* массива, нужно прибавить индекс этого элемента к адресу первого (нулевого элемента массива).
* Массивы эффективны для доступа (чтение и запись) к элементам, но неэффективны для изменения структуры (удаление и вставка)
*
* Чтобы получить доступ к эл массива, нужно указать его имя, квадратные скобки и индекс, например:
* array[5] - доступ к 6 элементу массива array; (счет начинается с 0)
* */

import java.util.Random;


public class Main {
    // Задача: сделать массив типа double из 10 элементов
    static Random rand = new Random(); // генератор случ чисел
    static int[] array;
    static double[] arr;
    public static void main(String[] args) {

        double[] arr = new double[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextDouble(); // инициализировали все элементы случайными числами

        }
        for(int i = 0; i < arr.length; i++) { // вывести каждый элемент массива
            System.out.println(arr[i]);
        }

        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);

        //_________________________________-
        int[] intArr = new int[15];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = rand.nextInt();

        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);

        }
        int sum1 = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum1 += intArr[i];
        }
        System.out.println(sum1);


        array = init(10, 7);
        display(array);
        // Метод для вывода любого массива
        array = init(20, 15);
        display(array);

        /*Метод для суммирования всех элементов массива*/

        int summary = sum(array);
        System.out.println(summary);
        System.out.println("сумма целых ч");

        //______________________________________
        arr =  initArray(3.5, 5.8);



        display2(arr);

        //__________________________________
        double result = sum(arr);
        System.out.println(result);
        }
    //__________________________________-
    /*Создать глобальный массив и метод для его инициализации*/

    /**
     * Метод для инициализации
     *
     * @param size размер
     * @param bound диапазон
     * @return массив
     */
    public static int[] init(int size, int bound){
        int[] arr = new int[size];                  // Создаем массив заданного размера
        for (int i = 0; i < arr.length; i++) {      // Цикл для итерации
            arr[i] = rand.nextInt(bound);           // Присваиваем рандомное значение в заданном диапазоне
        }
        return arr;                                 // Вызвать массив

    }

    /**
     * Метод для вывода любого массива
     * @param array в кач параметра передаем сам массив
     */
    public static void display(int[] array){
        System.out.println("Maccив2: ");
        for (int i = 0; i < array.length; i++) {  // итерируем массив (перебираем)
            System.out.print(array[i] + " ");     // на каждой итерации выводим эл на консоль в строку
        }
        System.out.println();                     // переход на новую строку
    }
    /*Метод для суммирования всех элементов массива*/

    /**
     * Метод для суммирования всех элементов массива
     * @param array сам массив
     * @return возвращает сумму элементов
     */
    public static int sum(int[] array){

        int sum = 0;                                    // переменная для суммы элементов
        for (int i = 0; i < array.length; i++) {        // итерируем весь массив в цикле
            sum += array[i];                            // суммируем элементы
        }
        return sum;                                     // возвращаем сумму
    }

    //__________________________________________________
    // повторить для double
    //__________________________________________________

    /*Создать глобальный массив и метод для его инициализации*/

    public static double[] initArray(double size1, double bound){

        double [] arr = new double [(int)size1];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextDouble(bound);
        }
        return arr;
    }
    //_________________________________________________
    //Метод для вывода любого массива
    //_____________________________________________

    public static void display2(double [] arr){  //массив пустой?
        System.out.println("Массив3: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    /*Метод для суммирования всех элементов массива*/
    public static double sum(double[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    }
