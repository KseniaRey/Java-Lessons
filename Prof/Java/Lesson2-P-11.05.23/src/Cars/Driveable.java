package Cars;

public interface Driveable {
    // тут можно создавать переменные, но по умолчании они все будут глобальными константными и статиками (static and final)
    String myClass = "Класс для машины";
    public void drive();
    public void stop();
    default public void fly(){
        System.out.println("Машины не летают, но мы ждем твои решения <3");
    }

}
