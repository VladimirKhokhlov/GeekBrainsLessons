package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Cat {
    private final String name;
    private int appetite;
    private int satiety;
    Scanner scanner = new Scanner(System.in);

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void info(){
        System.out.println("У " + name + "a аппетит = " + appetite + ", сытость = " + satiety);
    }

    public void infoAfterEat() {
        System.out.println("Теперь у " + name + "a аппетит = " + appetite + ", а сытость = " + satiety);
    }

    public void eat(Plate plate) {
        System.out.println(name + " подходит к миске и хочет поесть");
        isCatSatiety(plate);
    }

    private void isCatSatiety(Plate plate) {
        if (appetite < plate.getFood()) {
            plate.decreaseFood(getAppetite());
            satiety = appetite;
            appetite = 0;
            System.out.println(name + " покушал и очень доволен");
        }
        if (appetite > plate.getFood()) {
            System.out.println(name + " не поел. Добавьте еды!");
            int putFood = scanner.nextInt();
            plate.addFood(putFood);
            plate.decreaseFood(getAppetite());
            satiety = appetite;
            appetite = 0;
            System.out.println(name + " покушал и очень доволен");
        }
    }

    public int getAppetite() {
        return appetite;
    }
}
