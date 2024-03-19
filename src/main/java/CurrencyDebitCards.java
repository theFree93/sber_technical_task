import java.util.logging.Logger;

public class CurrencyDebitCards extends Cards {
    private static final Logger LOGGER = Logger.getLogger(CurrencyDebitCards.class.getName());
    public CurrencyDebitCards(String currency, double balance, String name) {
        super(currency, balance, name);
    }

    @Override
    public void cardIncrease(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public double getCurrentBalance() {
        return getBalance();
    }

    @Override
    public void withdrawal(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            LOGGER.warning("Insufficient funds in the balance.");
        }
    }
}
