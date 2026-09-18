package 策略模式;

import 策略模式.DiscountStrategy;

public class NormalDiscount implements DiscountStrategy {
    @Override
    public double calcPrice(double originPrice) {
        System.out.println("普通用户，无折扣");
        return originPrice;
    }
}
