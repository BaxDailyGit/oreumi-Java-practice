package p0205.dailyQuiz0205;

class Grocery extends Product {
    private int discountAmount;

    Grocery(String name, int price, int weight) {
        super(name, price, weight);
        this.discountAmount = 2000;
    }

    @Override
    public int getDiscountAmount() {
        return discountAmount;
    }
}