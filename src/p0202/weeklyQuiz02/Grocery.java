package p0202.weeklyQuiz02;

class Grocery extends Product implements DeliveryChargeCalculator {
    public Grocery(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(double weight, double price) {
        int baseCharge;
        if (weight < 3) {
            baseCharge = 1000;
        } else if (weight < 10) {
            baseCharge = 5000;
        } else {
            baseCharge = 10000;
        }

        if (price < 30000) {
            return baseCharge;
        } else if (price < 100000) {
            return baseCharge - 1000;
        } else {
            return 0;
        }
    }
}