package com.aim.animals;

public class Dog extends Animal implements Pet {

    private String breed;
    private String size;
    private short age;
    private String color;

    public void run() {
        System.out.println("Dogs run...");
    }

    public void eat() {
        System.out.println("Dogs eat dog food");
    }

    public void makeNoise() {
        System.out.println("Woof woof");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void play() {
        System.out.println("Dog plays by... " + howToPlay());
    }

    public String howToPlay() {
        return "fetching sticks";
    }
}