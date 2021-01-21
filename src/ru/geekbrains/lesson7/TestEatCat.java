package ru.geekbrains.lesson7;

public class TestEatCat {
    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Барсик", 10, 0);
        cat[1] = new Cat("Мурзик", 5, 0);
        cat[2] = new Cat("Матроскин", 15, 0);

        Plate plate = new Plate(20);
        System.out.println();

        plate.info();
        cat[0].eat(plate);
        plate.info();
        System.out.println();

        plate.info();
        cat[1].eat(plate);
        plate.info();
        System.out.println();

        plate.info();
        cat[2].eat(plate);
        plate.info();
    }
}
