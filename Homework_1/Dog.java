package Homework_1;

public class Dog extends Animal {

    public Dog(String name, Integer age, Boolean vaccination, String color, String species, Owner owner,
            Integer legsCount) {
        super(name, legsCount, vaccination, color, species, owner, legsCount);
    }

    public void bark() {
        System.out.println(name + " barking");
    }
}
