package Cars;

import Cars.Car;

public class Lamborghini extends Car {
    public Lamborghini(String title) {
        super(title);
    }

    @Override
    public void stop() {

    }

    @Override
    public void turnOn() {
        System.out.println(getTitle() + "Turn on with key");
    }
}
