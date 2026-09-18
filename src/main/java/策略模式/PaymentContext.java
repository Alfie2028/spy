package 策略模式;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean doPay(double amount) {
        return strategy.pay(amount);
    }
}
