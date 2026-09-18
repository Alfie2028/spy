package 策略模式;

public class BankCardStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.println("【银行卡支付】支付金额：" + amount);
        return true;
    }
}
