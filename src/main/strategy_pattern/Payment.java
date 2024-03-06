package main.strategy_pattern;

import main.strategy_pattern.strategy.PaymentStrategy;

public class Payment
{
    
    private PaymentStrategy paymentStrategy;
    
    public Payment (PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void setPaymentStrategy (PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public void performPayment (int amount) {
        paymentStrategy.performPayment(amount);
    }
    
}
