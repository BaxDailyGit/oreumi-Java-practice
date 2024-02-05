package p0202.weeklyQuiz02;

import java.math.BigDecimal;

// Grocery 클래스
class Grocery extends Product implements DeliveryChargeCalculator {
    public Grocery(String name, BigDecimal price, double weight) {
        super(name, price, weight);
    }

    @Override
    public BigDecimal getDeliveryCharge(Double weight, BigDecimal price) {
        BigDecimal baseCharge;
        if (weight < 3) {
            baseCharge = BigDecimal.valueOf(1000);
        } else if (weight < 10) {
            baseCharge = BigDecimal.valueOf(5000);
        } else {
            baseCharge = BigDecimal.valueOf(10000);
        }

        if (price.compareTo(BigDecimal.valueOf(30000)) < 0) {
            return baseCharge;
        } else if (price.compareTo(BigDecimal.valueOf(100000)) < 0) {
            return baseCharge.subtract(BigDecimal.valueOf(1000));
        } else {
            return BigDecimal.ZERO;
        }
    }
}