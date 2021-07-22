package designpatterns.behavioral.strategy.discount;

import java.math.BigDecimal;

public class DeepavaliDiscount implements Discount {
    @Override
    public BigDecimal applyDiscount(BigDecimal amount) throws IllegalArgumentException{
       if(amount.compareTo(BigDecimal.ZERO) > 0)
           return amount.multiply(new BigDecimal("0.8"));
       else
           throw  new IllegalArgumentException();
    }
}
