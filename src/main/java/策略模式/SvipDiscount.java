package 策略模式;

import 策略模式.DiscountStrategy;

public class SvipDiscount implements DiscountStrategy {
    @Override
    public double calcPrice(double originPrice) {
        System.out.println("SVIP用户，8折");
        return originPrice * 0.8;
    }
}
