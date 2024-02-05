package p0202.weeklyQuiz02;

import java.math.BigDecimal;

class Product {
    String name;
    BigDecimal price;
    double weight;

    public Product(String name, BigDecimal price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }
}