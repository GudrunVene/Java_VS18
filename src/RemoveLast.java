import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {

    public static void main(String[] args){

        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

// sorting brothers
       /* brothers.sort();*/
        Collections.sort(brothers);

// removing the last item
        removeLast(brothers);

        System.out.println(brothers);
    }

    public static void removeLast(ArrayList<String> list){

        int size =list.size();
        list.remove(size-1);
    }
}
