package ru.geekbrains.lesson7;

public class TestEatCat {
    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Барсик", 10, 0),
                new Cat("Мурзик", 5, 0),
                new Cat("Матроскин", 15, 0),
        };

        Plate plate = new Plate(20);
        System.out.println();

        catEat(cats, plate);
    }

    public static void catEat(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.info();
            plate.info();
            cat.eat(plate);
            cat.infoAfterEat();
            plate.info();
            System.out.println();
        }
    }
}
