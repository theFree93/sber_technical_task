public abstract class Cards extends BankingProducts{
    public Cards(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    public abstract void withdrawal(double amount);
}
