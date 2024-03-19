import java.util.logging.Logger;

public class DebitCards extends Cards {
    private static final Logger LOGGER = Logger.getLogger(DebitCards.class.getName());

    public DebitCards(String currency, double balance, String name) {
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
            throw new  IllegalArgumentException("Insufficient funds in the balance.");
        }
    }
}
