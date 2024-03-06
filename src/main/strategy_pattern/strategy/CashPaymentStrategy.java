package main.strategy_pattern.strategy;

public class CashPaymentStrategy
    implements PaymentStrategy
{
    
    @Override
    public void performPayment (int amount) {
        System.out.println("Cash payment of " + amount + " is successful");
    }
}
