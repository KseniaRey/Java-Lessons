public class Human {
    String name;
    String position;
    String age;
    public Human(String name, String position, String age) { // конструктор
    this.name = name;
    this.position = position;
    this.age = age;

    }
public void out(){
        System.out.println("Name: " + name + " Position: " + position + " Age: " + age);
}
    public void out1(){
        System.out.println("Name: " + name + " Age: " + age);
    }
}

