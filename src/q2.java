import java.util.ArrayList;
import java.util.HashSet;

public class q2 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(10);
        arr.add(1);
        arr.add(6);
        arr.add(8);
        arr.add(2);

        System.out.println("THE ARRAY-LIST : " +  arr);


        HashSet<Integer> hash = new HashSet<>(arr);
        System.out.println("\nAFTER CONVERT THE ARRAY-LIST INTO HASH-SET : " + hash);
    }
}
