package pl.behavioral.chain;

public class Bank extends Account{

    public Bank(Account nextAccount, double balance) {
        super(nextAccount, balance);
    }

    public String getName(){
        return "Bank";
    }
}
