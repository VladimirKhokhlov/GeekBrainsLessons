package ru.geekbrains.lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int i) {
        if (i > 500) {
            System.out.println(name + " не может пробежать дальше 500м!");
        }
        else if (i < 0){
            System.out.println("Не корректный ввод данных. Введите число больше 0");
        }
        else System.out.println(name + " пробежал " + i +"м");
    }

    @Override
    public void swim(int i) {
        if (i > 10){
        System.out.println(name + " проплыл " + i + "м");
        }
        else if (i < 0){
            System.out.println("Не корректный ввод данных. Введите число больше 0");
        }
        else System.out.println(name + " проплыл " + i +"м");
    }

    @Override
    public void jump(double i) {
        if (i > 0.5) {
            System.out.println(name + " не может прыгнуть выше 0.5м!");
        }
        else if (i < 0){
                System.out.println("Не корректный ввод данных. Введите число больше 0");
            }
        else System.out.println(name + " прыгнул на " + i + "м");
    }
}
