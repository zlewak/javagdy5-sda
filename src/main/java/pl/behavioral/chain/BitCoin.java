package pl.behavioral.chain;

public class BitCoin extends Account{

    public BitCoin(Account nextAccount, double balance) {
        super(nextAccount, balance);
    }

    public String getName(){
        return "BitCoin";
    }
}
