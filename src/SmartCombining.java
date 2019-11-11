import java.util.ArrayList;

public class SmartCombining {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(4);
        list1.add(3);
        list1.add(5);

        list2.add(5);
        list2.add(10);
        list2.add(7);

        smartCombine(list1, list2);

        System.out.println(list1);

        System.out.println(list2);
    }


    public static void smartCombine(ArrayList<Integer> first, ArrayList<Integer> second) {

            int length = second.size();

            while ( length > 0){
                int number = second.get(Integer.valueOf(length-1));
                boolean ans = first.contains(number);
                if (ans){
                    length--;
                    System.out.println(" new length "+length);
                } else {
                    first.add(number);
                    length--;
                    System.out.println("added number " + number + " new length "+length);
                }
            }
    }
}
