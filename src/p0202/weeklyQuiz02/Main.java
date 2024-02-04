package p0202.weeklyQuiz02;

public class Main {
    public static void main(String[] args) {

        Beauty lipstick = new Beauty("Lipstick", 25000, 0.1);
        System.out.println("Beauty Product: " + lipstick.name);
        System.out.println("Delivery Charge: " + lipstick.getDeliveryCharge(lipstick.weight, lipstick.price));


        Grocery rice = new Grocery("Rice", 20000, 5);
        System.out.println("Grocery Product: " + rice.name);
        System.out.println("Delivery Charge: " + rice.getDeliveryCharge(rice.weight, rice.price));


        LargeAppliance refrigerator = new LargeAppliance("Refrigerator", 120000, 20);
        System.out.println("Large Appliance Product: " + refrigerator.name);
        System.out.println("Delivery Charge: " + refrigerator.getDeliveryCharge(refrigerator.weight, refrigerator.price));
    }
}
