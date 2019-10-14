public class PrintingRectangle {

    private static void  printRow(int amount) {

        int i = 1;
        while (i <= amount){
            System.out.print("*");
            i ++;
        }
        System.out.println(" ");


    }

    private static void  printRectangle(int amount, int  row) {

        
        int i = 0;
        while (i < row) {
            printRow(amount);
            i ++;
        }

    }

    public static void main(String[] args) {

            printRectangle(17, 3);


    }
}
