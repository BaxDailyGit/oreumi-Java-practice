package p0205.dailyQuiz0205;
class Beauty extends Product {
    private int discountAmount;

    Beauty(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 10000;
    }

    @Override
    public int getDiscountAmount() {
        return discountAmount;
    }
}