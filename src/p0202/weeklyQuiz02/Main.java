package p0202.weeklyQuiz02;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Beauty lipstick = new Beauty("립스틱", new BigDecimal("25000"), 0.1);
        System.out.println("Beauty Product: " + lipstick.name);
        System.out.println("Delivery Charge: " + lipstick.getDeliveryCharge(lipstick.weight, lipstick.price));

        System.out.println("----------------------------------------");
        Grocery rice = new Grocery("밥", new BigDecimal("20000"), 5);
        System.out.println("Grocery Product: " + rice.name);
        System.out.println("Delivery Charge: " + rice.getDeliveryCharge(rice.weight, rice.price));

        System.out.println("----------------------------------------");
        LargeAppliance refrigerator = new LargeAppliance("냉장고", new BigDecimal("120000"), 20);
        System.out.println("Large Appliance Product: " + refrigerator.name);
        System.out.println("Delivery Charge: " + refrigerator.getDeliveryCharge(refrigerator.weight, refrigerator.price));
    }
}