

public class Main {
    public static void main(String[] args) {
        Animal manggom = new Animal();

        manggom.setName("망곰");
        manggom.setAge(5);
        manggom.setSpecies("곰");
        manggom.setColor("연한 갈색");
        manggom.setHabitat("시베리아");
        manggom.setFood("연어");

        System.out.println("------manggom의 프로필------");
        System.out.println("Name: " + manggom.getName());
        System.out.println("Age: " + manggom.getAge());
        System.out.println("Species: " + manggom.getSpecies());
        System.out.println("Color: " + manggom.getColor());
        System.out.println("Habitat: " + manggom.getHabitat());
        System.out.println("Food: " + manggom.getFood());
        System.out.println("---------------------------");

        manggom.eat();
        manggom.move();
        manggom.move();
        manggom.move();
        manggom.sleep();

        manggom.move();
        manggom.move();
        manggom.eat();
        manggom.move();
        manggom.move();
        manggom.sleep();

        manggom.eat();
        manggom.move();
        manggom.move();
        manggom.die(manggom.getAge(), "노화");

    }
}
