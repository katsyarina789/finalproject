package finalproject;

public class CreditCard {

    private int pinCode;
    private int balance;

    public CreditCard(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public int takeMonet(int money) throws NotEnoughMoneyException {
        if (money > balance)
            throw new NotEnoughMoneyException();
        balance -= money;
        return money;
    }

    public int takeMoney(int money){
        balance += money;
        return money;
    }
    public CreditCard(int pinCode, int balance){

        this.pinCode = pinCode;
        this.balance = balance;
    }
    public CreditCard(String masterCard, int i, int pinCode){
        this(pinCode, 0);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "pinCode=" + pinCode +
                ", balance=" + balance +
                '}';
    }
}



