package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args){
        guessTheNumber();
        }

    public static void guessTheNumber(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a;
        int b;
        int attemptsNum = 0;
        final int maxAttempts = 3;
        b = random.nextInt(10);
        System.out.println("Введите число от 0 до 9");
        do {
            a = scanner.nextInt();

            if (a < 0 || a > 9) {
            System.out.println("Дурень, введи от 0 до 9");
            }
            else if (a < b){
            System.out.println("Загаданное число больше!");
            }
            else if (a > b){
            System.out.println("Загаданное число меньше");
            }
        }
        while (a != b && ++attemptsNum < maxAttempts);

        if (attemptsNum == maxAttempts) {
            System.out.println("Бро, ты ошибся! число было:" + b);
        }
        else {
            System.out.println("Васся, красаучег! Ты выиграл! Загаданное число было " + b);
        }
        askIfYouWantToPlayMore();
    }

    static public void askIfYouWantToPlayMore() {
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 0) {
            System.out.println("Очень жаль, что ты нас покидаешь, бро");
        }
        else if (x == 1) {
            guessTheNumber();
        }
    }
}

