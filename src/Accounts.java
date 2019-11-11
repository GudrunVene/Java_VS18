public class Accounts {

    public static void main(String[] args) {

        Account mattsAccount = newAccount("Matt", 1000);
        Account myAccount = newAccount("My", 0);
        Account guduAccount = newAccount("Gudu", 0);


        transfer(mattsAccount, myAccount, 50);
        transfer(myAccount, guduAccount, 25);
        System.out.println("Matt's account balance is " + mattsAccount);
        System.out.println("My account balance is " + myAccount);
        System.out.println("Gudu's account balance is " + guduAccount);
    }

    public static void transfer(Account from, Account to, double howMuch){
        from.withdrawal(howMuch);
        to.deposit(howMuch);
    }

    public static Account newAccount(String owner, double balance) {

        Account ownerAccount = new Account(owner, balance );
        System.out.println("Initial state of new account");
        System.out.println(ownerAccount);
        return ownerAccount;

    }
}
