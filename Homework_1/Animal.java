package Homework_1;

public class Animal {
    public String name;
    private Integer age;
    private Boolean vaccination;
    private String color;
    private String species;
    private Owner owner;
    private Integer legsCount;

    public Animal(String name, Integer age, Boolean vaccination2, String color,
            String species, Owner owner, Integer legsCount) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.species = species;
        this.owner = owner;
        this.legsCount = legsCount;
    }

    public Animal(String color, String species, Integer legsCount) {
        this(null, null, null, color, species, null, legsCount);
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void toGo() {
        System.out.println(name + " is moving.");
    }

    public void fly() {
        System.out.println(name + " cannot fly.");
    }

    public void swim() {
        System.out.println(name + " cannot swim.");
    }

    @Override
    public String toString() {
        return String.format("Animal: {name = %s, owner = %s}", name, owner);
    }
}

class FlyingAnimal extends Animal {

    public FlyingAnimal(String name, Integer age, Boolean vaccination, String color, String species, Owner owner,
            Integer legsCount) {
        super(name, age, vaccination, color, species, owner, legsCount);
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }
}

class SwimmingAnimal extends Animal {

    public SwimmingAnimal(String name, Integer age, Boolean vaccination, String color, String species, Owner owner,
            Integer finsCount) {
        super(name, age, vaccination, color, species, owner, finsCount);
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}