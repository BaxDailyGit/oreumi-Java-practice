package p0202.weeklyQuiz02;

import java.math.BigDecimal;

// Beauty 클래스
class Beauty extends Product implements DeliveryChargeCalculator {
    public Beauty(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
        if (weight < 3) {
            return BigDecimal.valueOf(1000);
        } else if (weight < 10) {
            return BigDecimal.valueOf(5000);
        } else {
            return BigDecimal.valueOf(10000);
        }
    }
}