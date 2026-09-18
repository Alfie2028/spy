package 策略模式;

public class ApplePayStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("【ApplePay】支付金额：" + amount);
        return true;
    }
}
