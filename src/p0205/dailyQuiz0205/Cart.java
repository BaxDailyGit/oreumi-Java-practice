package p0205.dailyQuiz0205;
class Cart {
    Product[] products;

    Cart(Product[] products) {
        this.products = products;
    }

    int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;
        for (Product product : products) {
            totalWeight += product.weight;
            totalPrice += (product.price - product.getDiscountAmount()); 
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
            deliveryCharge = 0;
        } else if (totalPrice >= 30000) {
            deliveryCharge -= 1000;
        }

        return deliveryCharge;
    }
}
