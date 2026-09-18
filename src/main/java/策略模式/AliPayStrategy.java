package 策略模式;

public class AliPayStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("【支付宝】支付金额：" + amount);
        return true;
    }
}
