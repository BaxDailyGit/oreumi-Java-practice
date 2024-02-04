package p0202.weeklyQuiz02;

class Beauty extends Product implements DeliveryChargeCalculator {
    public Beauty(String name, double price, double weight) {
        super(name, price, weight);
    }

    @Override
    public int getDeliveryCharge(double weight, double price) {
        if (weight < 3) {
            return 1000;
        } else if (weight < 10) {
            return 5000;
        } else {
            return 10000;
        }
    }
}