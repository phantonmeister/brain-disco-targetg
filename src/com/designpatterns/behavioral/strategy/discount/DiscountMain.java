package designpatterns.behavioral.strategy.discount;

import java.math.BigDecimal;

public class DiscountMain {

    public static void main(String... args){

        BigDecimal amount = BigDecimal.valueOf(100);

        DiscountStrategy strategy = new DiscountStrategy(new ChristmasDiscount());
        System.out.println(strategy.executeDiscount(amount));

        DiscountStrategy dstrategy = new DiscountStrategy(new DeepavaliDiscount());
        System.out.println(dstrategy.executeDiscount(amount));
    }
}
