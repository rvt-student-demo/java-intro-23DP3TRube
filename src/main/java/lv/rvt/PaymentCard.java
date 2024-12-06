package lv.rvt;
public class PaymentCard {
    private double balance;


    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }


    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {


        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
}
}