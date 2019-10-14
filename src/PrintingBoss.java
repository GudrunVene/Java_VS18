public class PrintingBoss {

    private static void printStars(int amount) {

            int i = 1;

            while (i <= amount) {
                System.out.print("*");
                i++;
            }


    }

    private static void printWhitespaces(int amount) {

        while ( amount >= 0 ){
            System.out.print(" ");
            amount--;
        }
    }

    private static void  printTriangle(int size){

        int i = 1;
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);

            i ++;
        }

    }

    private static void xmasTreeLeg(int height){
        int i = 0;
        while (i < 2) {
            printWhitespaces(height );
            printStars(3);
            printWhitespaces(height );
            System.out.println(" ");
            i ++;
        }

    }

    private static void xmasTree(int height){

        int i = 1;
        while (i <= height) {
            printWhitespaces(height +2 -i );
            printStars(i);
            printStars(i-1);
            printWhitespaces(height +2 -i);
            System.out.println(" ");
            i ++;
        }

        xmasTreeLeg(height);
    }


    public static void main(String[] args) {

        xmasTree(4);

    }
}
