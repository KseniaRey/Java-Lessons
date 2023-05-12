package SimpleInheritance;

public class RubberDuck extends Duck{
    // --> переопределяем ненужные методы, чтобы резиновые утки могли только плавать, и не могли крякать и летать
    @Override
    public void quack(){

    }

    @Override
    public void fly() {
    }
}
