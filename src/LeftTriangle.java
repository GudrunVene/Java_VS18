public class LeftTriangle {

    private static void printStars(int amount) {

        int i = 1;
        while (i <= amount){
            System.out.print("*");
            i ++;
        }
        System.out.println(" ");

    }

    private static void  printTriangle(int size){

        int i = 1;
        while (i <= size) {
            printStars(i);
            i ++;
        }

    }

    public static void main(String[] args) {

        printTriangle(4);


    }
}
