package pl.behavioral.chain;

public abstract class Account {
    protected Account nextAccount;

    protected double balance;

    public Account(Account nextAccount, double balance) {
        this.nextAccount = nextAccount;
        this.balance = balance;
    }

    //glowna metoda kupujaca - wydaje pieniadze z obecnego konta
    public void pay(double amountToPay){
        if(this.canPay(amountToPay)){ // sprwadzam czy moge kupic obecnym kontem
            System.out.println("Udalo mi sie kupic " + getName() + ":" + amountToPay);
        } else if(this.nextAccount != null) { //sprawdzm czy istenije nastepne konto
            System.out.println("Nie udalo sie kupic " + getName());
            this.nextAccount.pay(amountToPay); // uruchamiam pay z nastepnego konta
        } else {//zabraklo juz w sumie pieniedzy
            System.out.println("Niestety nie udalo sie nic kupic");
        }
    }

    public boolean canPay(double amountToPay){
        return this.balance >= amountToPay;
    }

    public abstract String getName();
}
