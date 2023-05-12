package Strategy;

import java.sql.SQLOutput;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Don't fly");
    }
}
