package Homework_1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Dog", 5, true, "white", "Mammal", null, 4);
        dog.bark();
        dog.toGo();
        dog.swim();
        dog.fly();
        Bat bat = new Bat("Bat", 1, false, "black", "Mammal", null, 4);
        bat.echolocate();
        bat.fly();
        bat.swim();
        Whale whale = new Whale("Whale", 60, false, "blue", "Mammal", null, 2);
        whale.sing();
        whale.swim();
        whale.fly();
    }
}