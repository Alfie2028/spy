package 策略模式;

import 策略模式.DiscountStrategy;

public class VipDiscount implements DiscountStrategy {
    @Override
    public double calcPrice(double originPrice) {
        System.out.println("VIP用户，9折");
        return originPrice * 0.9;
    }
}
