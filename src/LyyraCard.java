public class LyyraCard {

    private double balance;
    private String owner;


    public LyyraCard(String owner, double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
        this.owner = owner;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }

    public void payEconomical() {
        // write code here
        if ( this.balance >= 2.5){
            this.balance = this.balance - 2.5;
        }

    }

    public void payGourmet() {
        // write code here
        if ( this.balance >= 4 ){
            this.balance = this.balance - 4;
        }
    }

    public void loadMoney(double amount) {
        // write code here
        if (amount > 0){
            if ( this.balance + amount < 150 ){
                this.balance = this.balance + amount;
            } else {
                this.balance = ( this.balance + amount - 150);
                System.out.println("money needed to return " + this.balance);
                this.balance = 150;
            }
        }


    }
}
