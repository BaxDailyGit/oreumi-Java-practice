package p0205.dailyQuiz0205;

class Product implements Promotion {
    String name;
    int price;
    int weight;

    Product(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    @Override
    public int getDiscountAmount() {
        return 0; // 할인 금액을 구현할 필요가 없는 경우
    }
}
