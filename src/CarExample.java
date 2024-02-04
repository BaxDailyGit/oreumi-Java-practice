public class CarExample {
    public static void main(String[] args) {

        Car sonata = new Car();
        Car jinju = new Car();


        

        sonata.setCompany("Hyundai");
        sonata.setSoftware("Android Auto");
        sonata.setColor("White");
        sonata.setMaxSpeed(200);
        sonata.setPrice(1000);

        Car k5 = new Car("Kia");

        Car avante = new Car("Hyundai", 250);

        Car palisade = new Car("Hyundai", "Android Auto", "Black");

        Car genesis = new Car("Hyundai", "Android Auto", "Black", 250, 2000);



    }
}