package designpatterns.behavioral.strategy.discount;

import java.math.BigDecimal;

public class DiscountStrategy {

    private Discount discountStrategy;

    public DiscountStrategy(Discount discount){
        this.discountStrategy = discount;
    }

    public BigDecimal executeDiscount(BigDecimal amount){
        return  discountStrategy.applyDiscount(amount);
    }
}
