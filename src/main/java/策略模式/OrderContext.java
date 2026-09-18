package 策略模式;

public class OrderContext {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getFinalPrice(double originPrice) {
        return discountStrategy.calcPrice(originPrice);
    }
}
