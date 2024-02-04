package p0202.mento0202;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("하루");
        Cat cat = new Cat("나비");
        Car car = new Car("현대자동차");

        dog.eat();
        dog.makeSound();

        cat.eat();
        cat.makeSound();

        car.drive();
        car.makeSound();
    }
}