package main.strategy_pattern;

import main.strategy_pattern.strategy.CardPaymentStrategy;
import main.strategy_pattern.strategy.CashPaymentStrategy;

public class PaymentMain
{
    public static void main(String[] args) {
        Payment payment = new Payment(new CashPaymentStrategy());
        payment.performPayment(1000);
    
        payment.setPaymentStrategy(new CardPaymentStrategy());
        payment.performPayment(2000);
    }
}
