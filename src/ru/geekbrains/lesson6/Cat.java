package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int i) {
        if (i > 200) {
            System.out.println(name + " не может пробежать дальше 200м!");
        }
        else if (i < 0){
            System.out.println("Не корректный ввод данных. Введите число больше 0");
        }
        else System.out.println(name + " пробежал " + i +"м");
    }

    @Override
    public void swim(int i) {
        System.out.println(name + " не умеет плавать!!!");
    }

    @Override
    public void jump(double i) {
        if (i > 2){
            System.out.println(name + " не может прыгнуть выше 2м!");
        }
        else if (i < 0){
            System.out.println("Не корректный ввод данных. Введите число больше 0");
        }
        else {
            System.out.println(name + " прыгнул на " + i + "м");
        }
    }
}