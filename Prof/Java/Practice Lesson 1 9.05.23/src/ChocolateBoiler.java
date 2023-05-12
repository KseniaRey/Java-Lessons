public class ChocolateBoiler {
    private boolean empty;      // is this empty boiler?
    private boolean boiled;     // is this warm chocolate?
    public ChocolateBoiler(){
        empty = true;
        boiled = false;
    }
    public void fill(){
        if(empty){
            empty = false;
            boiled = false;
        }
    }
    public void drain(){
        if(!empty && boiled){
            empty = true;
        }
    }
    public void boil(){
        if(!empty && !boiled){
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
