package ru.geekbrains.lesson1;

public class FirstApp {

    public static void main(String[] args) {
        System.out.println(theEquation(3 , 4,5,6));
        System.out.println(checkSum(100,15));
        checkNum(3);
        System.out.println(num(-5));
        name("Жора");

    }

    byte b1 = 100;
    short s1 = 10000;
    int i1 = 1000000000;
    long l1 = 1000000000000000000l;
    float f1 = 15.5f;
    double d1 = 4.1;
    char c1 = 'r';
    boolean bl1 = true;


    public static int theEquation(int a, int b, int c, int d){
        int e = a * (b + (c / d));
        return e;
    }


    public static boolean checkSum (int a, int b){
        boolean bl;
        if (a + b >= 10 && a + b <= 20) {
            bl = true;
        }
        else{
            bl = false;
        }
        return bl;
    }

    public static void checkNum (int a){
        if(a >=0){
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean num(int a){
        if(a < 0){
           return true;
        }
        return false;
    }

    public static void name (String name){
        System.out.println("Привет, " + name);
    }
}
// ...