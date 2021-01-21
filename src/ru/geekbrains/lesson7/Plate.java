package ru.geekbrains.lesson7;

public class Plate {
    private static int food;

    public Plate(int food) {
        Plate.food = food;
    }

    public void info(){
        System.out.println("Еды в тарелке: " + food);
    }

    public static int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (appetite > food) {
            System.out.println("В тарелке слишком мало еды!");
        }
        if (appetite < food){
            food -= appetite;
        }
    }
}
