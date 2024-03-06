package main.strategy_pattern.strategy;

public class CardPaymentStrategy
    implements PaymentStrategy
{
    
    @Override
    public void performPayment (int amount) {
        System.out.println("Card payment of " + amount + " is successful");
    }
}
