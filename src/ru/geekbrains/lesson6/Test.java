package ru.geekbrains.lesson6;

public class Test {
    public static void main(String[] args) {

        Animal barsic = new Cat("Барсик");
        Animal vaska = new Cat("Васька");
        Animal myrzik = new Cat("Мурзик");

        Animal sharik = new Dog("Шарик");
        Animal bobik = new Dog("Бобик");
        Animal pirat = new Dog("Пират");

        barsic.run(150);
        barsic.swim(150);
        barsic.jump(10);
        System.out.println();

        vaska.run(50);
        vaska.swim(20000);
        vaska.jump(2);
        System.out.println();

        myrzik.run(500);
        myrzik.swim(-8150);
        myrzik.jump(0.5);
        System.out.println();

        sharik.run(500);
        sharik.swim(9);
        sharik.jump(0.3);
        System.out.println();

        bobik.run(1000);
        bobik.swim(2);
        bobik.jump(0.1);
        System.out.println();

        pirat.run(123);
        pirat.swim(50);
        pirat.jump(-20);
    }
}
