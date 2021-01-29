package com.aim.animals;

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog();
        // dog.run();
        dog.sleep();
        dog.makeNoise();
        dog.eat();

        Animal cat = new Cat();
        cat.sleep();
        cat.makeNoise();
        cat.eat();
    }
}