import java.util.Objects;

public class Car {
    private int price;
    private double speed;
    private String brand; // переменная класса

    public Car(int price, double speed, String brand){
        this.price = price;
        this.speed = speed;
        this.brand = brand;
    }
/*Если мы сейчас создадим в мейне 2 объекта - car и car1, то они будут не равны, потому что это 2 разных объекта, кот
* лежат в разных ячейках в области памяти. Но чтобы сравнить их значения, нам нужно создать методы
* to String(чтобы сравнивать все данные в виде строк) и equals (чтобы сравнивать значение объекта, а не его ссылки)
*  в классе. */
    @Override
    public boolean equals(Object o) { // этим методом мы сравниваем значения, а не ссылки на объект.
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Double.compare(car.speed, speed) == 0 && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, speed, brand);
    }

    @Override                                       // Указание на то, что метод переопределен
    public String toString() {                      // Теперь метод toString класса Object будет возвращать текстовое представление объекта
        return "Car{" +                             // Верни все в виде строки?
                "price=" + price +
                ", speed=" + speed +
                ", brand='" + brand + '\'' +
                '}';
    }
}
