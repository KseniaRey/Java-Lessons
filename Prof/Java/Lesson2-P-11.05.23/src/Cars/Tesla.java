package Cars;

import Cars.Car;

public class Tesla extends Car {
    public Tesla(String title) {
        super(title);
    }

    @Override
    public void stop() {

    }

    /**
     * Родительский метод. Строкой System.out.println("А вот эта уже летает"); --> мы его переопределяем
     */
    @Override
    public void fly() {
        // super.fly();  // --> через точку взята реализация родительского, по умолчанию будет так. так как это оверрайд, можем дописать то, что хотим:
        System.out.println("А вот эта уже летает");
    }

    @Override
    public void turnOn() {
        System.out.println("Заводится отпечатком");
    }

    public void madeIn(){
        System.out.println("Made by people from Earth");
    }
    @Override
    public String toString(){
        return "Класс Тесла: " + super.getTitle();
    }
}
