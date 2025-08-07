package Practice.OOPs.Generics;

import java.util.Arrays;

public class CustomGenArrayLIst<T> {

    private Object[] arr;
    private int size;
    private static int default_size = 10;

    public CustomGenArrayLIst() {
        arr = new Object[default_size];
    }

    public void add(T value){
        if (isFull()){
            resize();
        }
        arr[size++] = value;
    }

    public void resize(){
        Object temp[] = new Object[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public T remove(){
        T removed = (T) arr[--size];
        return removed;
    }

    public T get (int index){
        if (index >= size)
            throw new IndexOutOfBoundsException("Array index ouut of bound.");
        return (T)arr[index];
    }

    public void set (int index , T value){
        arr[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayLIst{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                ", default_size=" + default_size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenArrayLIst<Integer> list  = new CustomGenArrayLIst<>();

        for (int i = 0; i < 13; i++) {
            list.add((i+1) * 2);
        }
        System.out.println(list.toString());

        list.remove();

        System.out.println(list.get(11));

//        CustomGenArrayLIst<String> list2 = new CustomGenArrayLIst<>();
//
//        list2.add("Bitch.");
//        list2.add("Nigga");
//        list2.add("Fuck");
//        System.out.println(list2.toString());
//        list2.remove();
    }
}
// In this program we can manipulate the integer array not other datatye.
//  basically we arraylist can manipulate any type of array.