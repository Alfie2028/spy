package 策略模式;

import 策略模式.DiscountStrategy;

public class FullReduceDiscount implements DiscountStrategy {
    @Override
    public double calcPrice(double originPrice) {
        System.out.println("满300减50");
        if (originPrice >= 300) {
            return originPrice - 50;
        }
        return originPrice;
    }
}
