package Cars;

public class BMW extends Car {
    public BMW(String title) {
        super(title);  // -- ссылка на родителя
    }

    @Override
    public void stop() {

    }

    @Override
    public void turnOn() {
        System.out.println(getTitle() + "Turn on with button");
    }
}
