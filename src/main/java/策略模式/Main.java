package 策略模式;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== 任务1：支付策略测试 =====");
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setStrategy(new AliPayStrategy());
        paymentContext.doPay(199);

        paymentContext.setStrategy(new WeChatPayStrategy());
        paymentContext.doPay(299);

        paymentContext.setStrategy(new BankCardStrategy());
        paymentContext.doPay(399);

        paymentContext.setStrategy(new ApplePayStrategy());
        paymentContext.doPay(499);


        System.out.println("\n===== 任务2：折扣策略测试 =====");
        OrderContext orderContext = new OrderContext();
        double price = 350;

        orderContext.setDiscountStrategy(new NormalDiscount());
        System.out.println("最终价格：" + orderContext.getFinalPrice(price));

        orderContext.setDiscountStrategy(new VipDiscount());
        System.out.println("最终价格：" + orderContext.getFinalPrice(price));

        orderContext.setDiscountStrategy(new SvipDiscount());
        System.out.println("最终价格：" + orderContext.getFinalPrice(price));

        orderContext.setDiscountStrategy(new FullReduceDiscount());
        System.out.println("最终价格：" + orderContext.getFinalPrice(price));
    }
}
