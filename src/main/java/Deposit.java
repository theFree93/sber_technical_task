public class Deposit extends BankingProducts{
    public Deposit(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public double getCurrentBalance() {
        return getBalance();
    }

    @Override
    public void cardIncrease(double amount) {
        setBalance(getBalance() + amount);
    }
}
