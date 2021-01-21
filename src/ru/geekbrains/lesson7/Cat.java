package ru.geekbrains.lesson7;

public class Cat {
    private final String name;
    private static int appetite;
    private static int satiety;

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        Cat.appetite = appetite;
        Cat.satiety = satiety;
    }

    public void eat(Plate plate) {
        System.out.println(name + "" +
                " подходит к миске и пытается поесть");
        plate.decreaseFood(getAppetite());
        if (isCatSatiety()) {
            System.out.println(name + " покушал и очень доволен");
        }
        if (!isCatSatiety()) {
            System.out.println(name + " не поел. Добавьте еды!");
        }
    }

    private static boolean isCatSatiety() {
        if (appetite < Plate.getFood()) {
            satiety = appetite;
            appetite = 0;
        }
        return false;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        Cat.appetite = appetite;
    }
}
