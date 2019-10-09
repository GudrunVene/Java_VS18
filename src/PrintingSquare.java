public class PrintingSquare {

    private static void  printSquare(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 1;
        while (i <= amount){
            System.out.print("*");
            i ++;
        }
        System.out.println(" ");

    }

    public static void main(String[] args) {
        int i = 0;
        while (i < 4) {
            printSquare(4);
            i ++;
        }

    }
}
