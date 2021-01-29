package com.aim.animals;

public abstract class Animal {

    public String name;

    public abstract String howToPlay();

    public void eat() {
        System.out.println("Animals eat...");
    }

    public final void sleep() {
        System.out.println("Animals sleep...");
    }

    public abstract void makeNoise();

}