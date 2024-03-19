import java.util.logging.Logger;

public abstract class BankingProducts {
    private static final Logger LOGGER = Logger.getLogger(BankingProducts.class.getName());
    private String currency;
    private double balance;
    private String name;

    public double getBalance() {
        return balance;
    }

    public BankingProducts(String currency, double balance, String name) {
        this.currency = currency;
        this.balance = balance;
        this.name = name;
    }

    public abstract double getCurrentBalance();

    public abstract void cardIncrease(double amount);

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
