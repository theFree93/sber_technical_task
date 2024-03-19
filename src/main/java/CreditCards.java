import java.util.logging.Logger;

public class CreditCards extends Cards {
    private static final Logger LOGGER = Logger.getLogger(CreditCards.class.getName());
    private double interestRate;

    public CreditCards(String currency, double balance, String name, double interestRate) {
        super(currency, balance, name);
        this.interestRate = interestRate;
    }

    @Override
    public double getCurrentBalance() {
        return getBalance();
    }

    @Override
    public void cardIncrease(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdrawal(double amount) {
        if (getBalance() >= 0) {
            setBalance(getBalance() - amount);
        } else {
            LOGGER.warning("Insufficient funds in the balance.");
        }
    }

    public double requestDebt() {
        return getBalance() * interestRate / 100;
    }
}
