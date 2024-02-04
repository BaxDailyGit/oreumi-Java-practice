package p0202.mento0202;

public class Vehicle {
    String brand;

    public Vehicle(String brand){
        this.brand = brand;
    }

    public void drive(){
        System.out.println(brand + "를 운전합니다.");
    }
}

class Car extends Vehicle implements Sound {
    public Car(String brand){
        super(brand);
    }

    @Override
    public void makeSound() {
        System.out.println("부릉부릉");
    }

}