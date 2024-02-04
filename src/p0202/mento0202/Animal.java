package p0202.mento0202;

class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    void eat() {
        System.out.println(name + "가 먹고 있습니다.");
    }
}

class Dog extends Animal implements Sound {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + "는 개껌을 좋아합니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal implements Sound {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(name + "는 츄르를 좋아합니다.");
    }

    @Override
    public void makeSound() {
        System.out.println("냐옹");
    }
}