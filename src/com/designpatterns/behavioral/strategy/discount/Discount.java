package designpatterns.behavioral.strategy.discount;

import java.math.BigDecimal;

public interface Discount {

    public BigDecimal applyDiscount(BigDecimal amount);
}
