package Practice.Collection;

import java.util.Arrays;

public class CustomArrayLIst {

    private int arr[];
    private int size;
    private int default_size = 10;

    public CustomArrayLIst() {
        this.arr = new int[default_size];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        arr[size++] = num;
    }

    public void resize(){
        int temp[] = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    public boolean isFull(){
        return size == arr.length;
    }

    public int remove(){
        int removed = arr[--size];
        return removed;
    }

    public int get (int index){
        return arr[index];
    }

    public void set (int index , int value){
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

        CustomArrayLIst list  = new CustomArrayLIst();

        for (int i = 0; i < 13; i++) {
            list.add((i+1) * 2);
        }
        System.out.println(list.toString());

        list.remove();

        System.out.println(list.get(12));
    }
}
// In this program we can manipulate the integer array not other datatye.
//  basically we arraylist can manipulate any type of array.