import java.text.SimpleDateFormat;
import java.util.Date;

public class Animal {
    private String name;
    private int age;
    private String species;
    private String color;
    private String habitat;
    private String food;

    Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void sleep() {
        Date sleepTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
        String formattedSleepTime = dateFormat.format(sleepTime);
        System.out.println(name + "이(가) " + formattedSleepTime + "에 잠을 잡니다. zzZ");
    }

    public void eat() {
        Date eatTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
        String formattedEatTime = dateFormat.format(eatTime);
        System.out.println(name + "이(가) " + formattedEatTime + "에 " + food + "을(를) 먹습니다.");
    }

    public void move() {
        System.out.println(name + "이(가) 이동합니다.");
    }

    public void die(int ageAtDeath, String reason) {
        Date deathTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
        String formattedDeathTime = dateFormat.format(deathTime);
        System.out.println(name + "(이)가 " + formattedDeathTime + "에 " + ageAtDeath + "세로 " + reason + "로 인해 죽었습니다.");
    }
}
