package pl.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Account bitcoin = new BitCoin(null, 1000);
        Account paypal = new PayPal(bitcoin, 200);
        Account myBank = new Bank(paypal, 100);

        myBank.pay(120);

        myBank.pay(50);

        myBank.pay(800);

        myBank.pay(1500);
    }
}
