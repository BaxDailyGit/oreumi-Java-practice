package p0205.dailyQuiz0205;
class Cart {
    private Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += (product.getPrice() - product.getDiscountAmount()); // 할인 적용된 가격으로 계산
        }

        int deliveryCharge;
        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (totalPrice >= 100000) {
            deliveryCharge = 0; // 가격이 100000 이상이면 배송비 무료
        } else if (totalPrice >= 30000) {
            deliveryCharge -= 1000; // 가격이 30000 이상이면 배송비에서 1000 할인
        }

        return deliveryCharge;
    }
}