public class Calculator {
    private String title;

    public Calculator(String title) {
        this.title = title;
    }

    public Calculator() {
    }

    public static int version = 1;
    public int sum (int a, int b){
        return a+b;
    }
    public int sub (int a, int b){
        return a-b;
    }
    public int mul (int a, int b){
        return a*b;
    }
    public double div(int a, int b){
        return a/b;
    }

    public String getTitle() {
        return title;
    }
}
