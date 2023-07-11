package Homework_1;

public class Bat extends FlyingAnimal {
    public Bat(String name, Integer age, Boolean vaccination, String color, String species, Owner owner,
            Integer legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
    }

    public void echolocate() {
        System.out.println(name + " echolocates.");
    }
}
