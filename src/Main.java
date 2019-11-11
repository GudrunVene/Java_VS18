public class Main {

    public static void main(String[] args) {

        Person bob = new Person("Bob");
        Person andy = new Person("Andy");

        int i = 0;
        while ( i < 30 ) {
            bob.becomeOlder();
            i++;
        }

        andy.becomeOlder();

        System.out.println( andy ); // same as System.out.println( andy.toString() );
        System.out.println( bob ); // same as System.out.println( bob.toString() );
    }
}
