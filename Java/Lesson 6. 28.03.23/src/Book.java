public class Book { // класс для создания шаблона под книгу, на его основе будем создавать книги
    String description; // все переменные тут глобальные, лежат в классе, но вне метода.
    String title;
    String author;
    String genre;
    int quantity; // кол-во страниц книги


/*
* Поля класса декларированы, но не инициализированы
* Для создания конкретной книги, нужно инициализировать переменные, т.е, присвоить значение.
* В классе для выполнения такой задачи существуют специальные методы - конструкторы.
* Конструкторы всегда пишутся с большой буквы, не имеют типа метода и совпадает с названием класса, в котором он определен.
* Например, в текущем классе все конструкторы будут иметь название "Book();"
* //______
* this.  --  линк на текущий экз объекта. В конструкторе строчка "this.description = description;" означает:
* присвой полю description(глобальной переменной), значение параметра конструктора description(локальной переменной).
* */

    public Book(String description, String title, String author, String genre, int quantity){
        this.description = description; // присвоение к глобальным переменным (полям класса) их локальные значения (параметры
        // конструктора ) с таким же названием при помощи слова this
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.quantity = quantity;
    }

        /*
        * Метод out выводит на консоль все переменные объекта
        * */
    public void out(){ // определен в классе Book, выводит Book
        System.out.println("description: " + description + "\n" // "\n" - с новой строки
        + "title: " + title + "\n" +
                "author: " + author + "\n" +
                "genre: " + genre + "\n" +
                "quantity: " + quantity + "\n");
    }

}