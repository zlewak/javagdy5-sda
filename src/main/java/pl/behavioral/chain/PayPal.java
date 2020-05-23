package pl.behavioral.chain;

public class PayPal extends Account{

    public PayPal(Account nextAccount, double balance) {
        super(nextAccount, balance);
    }

    public String getName(){
        return "PayPal";
    }
}
