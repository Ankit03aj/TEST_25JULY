import java.util.ArrayList;
import java.util.LinkedList;

/*
COLLECTION FRAME WORK :- collection frame work means the store a data or an element in frame work(e.g. in list,array,e.t.c).
                          we can manipulate, retrieve or update the data in collection frame work.
 */
public class q3 {

    public static void main(String[] args) {

        // example of list
        // 1. Arraylist
        ArrayList<String> aj = new ArrayList<>();
        aj.add("ankit");  // this method help to store a data in arraylist.
        aj.add("aayush");
        aj.add("nidhi");
        aj.add("shahroz");
        aj.add("himanshu");
        aj.add("mudit");

        System.out.println("Array_list : " + aj);

        //2.linklist

        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);
        link.add(6);
        link.add(1);

        System.out.println("\nLINK_LIST : " + link);
    }
}
