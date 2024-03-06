package main.strategy_pattern.strategy;

public interface PaymentStrategy
{
    
    // PaymentStrategy 인터페이스를 구현한 다양한 결제 전략 클래스(구현체)를 실행 시점에 Payment 클래스에 지정해 주게 되면, 런타임 실행 시 각 구현체에 맞는 결제 전략으로 결제 되도록 구현
    // 어떤 결제 방식이 추가 된다고 해도, Payment 클래스에 변경을 가져오지 않고 결제 전략을 변경하는 것으로 기능을 추가할 수 있게되어 OCP를 위반하지 않게 됩니다.
    void performPayment (int amount);
}
