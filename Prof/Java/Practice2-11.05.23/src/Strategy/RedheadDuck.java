package Strategy;

public class RedheadDuck extends Duck{

    public RedheadDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Qunack();
    }

    @Override
    public void display() {
        System.out.println("German Duck");
    }
}
