package com.aim.animals;

public class AppInheritance1 {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.eat();

        // Set the name of the Dog
        dog.name = "Leo";

        // Call each of the four behavior methods available to the dog
        dog.eat();
        dog.sleep();
        dog.makeNoise();
        dog.run();

        Cow cow = new Cow();
        cow.howToEat();

        Duck duck = new Duck();
        duck.play();

        Chicken chicken = new Chicken();
        chicken.howToEat();
        chicken.play();

        System.out.println("My dog's name is: " + dog.name);

    }
}