package ru.geekbrains.quarter2.lesson1;

public class Robot {
    String name;
    int jump;
    int run;

    public Robot(String name, int jump, int run) {
        this.name = name;
        this.jump = jump;
        this.run = run;
    }

    public static void run(String name) {
        System.out.println(name + " пробежал!");
    }

    public static void jump(String name) {
        System.out.println(name + " перепрыгнул!");
    }
}
