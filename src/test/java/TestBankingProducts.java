import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBankingProducts {
    private CreditCards creditCard;
    private DebitCards debitCard;
    private CurrencyDebitCards currencyDebitCard;
    private Deposit deposit;

    @BeforeMethod
    public void setUp() {
        creditCard = new CreditCards("USD", 1000.0, "Credit Card", 3.5);
        debitCard = new DebitCards("USD", 2000.0, "Debit Card");
        currencyDebitCard = new CurrencyDebitCards("EUR", 1500.0, "Currency Debit Card");
        deposit = new Deposit("USD", 5000.0, "Deposit");
    }

    @Test
    public void testCreditCardIncrease() {
        creditCard.cardIncrease(500.0);
        Assert.assertEquals(1500.0, creditCard.getCurrentBalance());
    }

    @Test
    public void testCreditCardWithdrawal() {
        creditCard.withdrawal(200.0);
        Assert.assertEquals(800.0, creditCard.getCurrentBalance());
    }

    @Test
    public void testDebitCardIncrease() {
        debitCard.cardIncrease(500.0);
        Assert.assertEquals(2500.0, debitCard.getCurrentBalance());
    }

    @Test
    public void testDebitCardWithdrawal() {
        debitCard.withdrawal(200.0);
        Assert.assertEquals(1800.0, debitCard.getCurrentBalance());
    }

    @Test
    public void testCurrencyDebitCardIncrease() {
        currencyDebitCard.cardIncrease(500.0);
        Assert.assertEquals(2000.0, currencyDebitCard.getCurrentBalance());
    }

    @Test
    public void testCurrencyDebitCardWithdrawal() {
        currencyDebitCard.withdrawal(200.0);
        Assert.assertEquals(1300.0, currencyDebitCard.getCurrentBalance());
    }

    @Test
    public void testDepositIncrease() {
        deposit.cardIncrease(500.0);
        Assert.assertEquals(5500.0, deposit.getCurrentBalance());
    }
}
