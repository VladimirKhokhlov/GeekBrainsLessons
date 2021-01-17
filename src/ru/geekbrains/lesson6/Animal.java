package ru.geekbrains.lesson6;

public abstract class Animal {

    protected String name;

    public Animal (String name){
        this.name = name;
    }

    public abstract void run(int i);

    public abstract void swim(int i);

    public abstract void jump(double i);



}
