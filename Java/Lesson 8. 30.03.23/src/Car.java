public class Car {

    private String brand;
    private int age;
    private double price;
    boolean Ecological;

    // Демонстрируем полиморфизм объектов

    /**
     * Конструктор для создания объекта с 4 переменными:
     * @param brand - марка
     * @param age - год
     * @param price - цена
     * @param ecological - экологично или нет, булевое значение
     */
    public Car(String brand, int age, double price, boolean ecological) {  // Shortcut is Alt+Insert (inside of main class)
        this.brand = brand;
        this.age = age;
        this.price = price;
        Ecological = ecological;
    }

    /**
     * Конструктор для создания объекта с 3 переменными:
     * @param brand - марка
     * @param age - год
     * @param price - цена
     */
    public Car(String brand, int age, double price) {
        this.brand = brand;
        this.age = age;
        this.price = price;
    }

    /**
     * Пример работы геттера:
     * @return
     */
    public String getBrand() {
        return brand;
    }

    public int getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public boolean isEcological() {
        return Ecological;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEcological(boolean ecological) {
        Ecological = ecological;
    }

    public void setPrice(int i) {
        price = i;


    }
}

