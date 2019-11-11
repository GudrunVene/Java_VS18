public class Accounts {

    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account",100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland",1000000.00);

       /* System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: "+bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: "+bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);*/

        Account mattsAccount = newAccount("Matt", 1000);
        Account myAccount = newAccount("My", 0);

        mattsAccount.withdrawal(100);
        System.out.println("Matt's account balance is " + mattsAccount);
        myAccount.deposit(100);
        System.out.println("My account balance is " + myAccount);
    }

    public static Account newAccount(String owner, double balance) {

        Account ownerAccount = new Account(owner, balance );
        System.out.println("Initial state of new account");
        System.out.println(ownerAccount);
        return ownerAccount;

    }
}
