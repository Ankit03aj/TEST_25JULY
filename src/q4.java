import java.util.ArrayList;

public class q4 {

    public static void main(String[] args) {


        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);   // the method add an element in arraylist
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("ARRAY : " + arr);

        arr.add(4,100);
        arr.add(6,200);

        System.out.println("\nARRAY AFTER THE UPDATE : " + arr);

        arr.remove(1);
        System.out.println("\nARRAY AFTER THE DELETE AN ELEMENT FROM INDEX 1 : " + arr);


        System.out.println("\nARRAY CONTAINS THE VALUE '100' : " + arr.contains(100));

    }
}
