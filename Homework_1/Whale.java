package Homework_1;

public class Whale extends SwimmingAnimal {
    public Whale(String name, Integer age, Boolean vaccination, String color, String species, Owner owner,
            Integer finsCount) {
        super(name, age, vaccination, color, species, owner, finsCount);
    }

    public void sing() {
        System.out.println(name + " sings.");
    }
}
