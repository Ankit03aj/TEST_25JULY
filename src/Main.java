import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(10);
        arr.add(1);
        arr.add(6);
        arr.add(8);

        System.out.println("ARRAY_LIST : " + arr);

        Collections.sort(arr);
        System.out.println("\nAFTER SORTING THE ARRAY : " + arr);

        System.out.println("\nTHE SECOND MINIMAL VALUE IN ARRAY_LIST : " + arr.get(1));
    }

}