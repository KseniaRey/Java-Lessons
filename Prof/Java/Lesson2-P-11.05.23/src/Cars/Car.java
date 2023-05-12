package Cars;

public abstract class Car implements Driveable {
    private String title;

    public Car(String title) {
        this.title = title;
    }

    public abstract void stop();

    public void drive(){
        System.out.println(title + " is driving");
    }
    public abstract void turnOn(); // --> у абстрактных методов не может быть тела

    public String getTitle() {  // --> делаем только геттер, сеттер только в крайнем случае
        return title;
    }
}
