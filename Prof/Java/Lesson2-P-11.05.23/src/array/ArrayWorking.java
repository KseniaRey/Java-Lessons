package array;

public class ArrayWorking {
Object[] objects = new Object[10];
int count = 0;
public void add(Object object){
    objects[count] = object;
    count++;
}
public void display(){

    for (int i = 0; i < count; i++) {
        System.out.print(objects[i]);
    }
}
 }
