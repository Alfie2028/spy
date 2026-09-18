package 策略模式;

public class WeChatPayStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("【微信支付】支付金额：" + amount);
        return true;
    }
}

