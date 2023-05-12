public class Singleton {                    // -->  у синглтона всегда будет только 1 объект
    private static Singleton instance;
    private String name;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance == null){                       // проверка наличия переменной. Если нет - создать. Это спасет нас от слишком большого кол-ва переменных (окон)
            instance = new Singleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Singleton{" +
                "name='" + name + '\'' +
                '}';
    }
}
