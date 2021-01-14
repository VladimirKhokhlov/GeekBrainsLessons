package ru.geekbrains.lesson6;

public abstract class Animal {

    protected String name;

    public Animal (String name){
        this.name = name;
    }

    public abstract int run(int i);

    public abstract int swim(int i);

    public abstract double jump(double i);



}
