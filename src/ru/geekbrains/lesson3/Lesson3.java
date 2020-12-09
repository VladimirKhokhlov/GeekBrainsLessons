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
        b = random.nextInt(10);
        System.out.println("Введите число от 0 до 9");
        do {
            a = scanner.nextInt();

            if (a < 0 || a > 9) {
            System.out.println("Дурень, введи от 0 до 9");
            }
            else if (a < b){
            System.out.println("загаданное чилсло больеше");
            }
            else if (a > b){
            System.out.println("загаданное число меньше");
            }
        }
        while (a != b);
    }
}
