package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info(){
        System.out.println("Еды в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite) {
        if (appetite <= food){
            food -= appetite;
        }
    }

    public void addFood(int putFood) {
        this.food += putFood;
        System.out.println("Вы добавили " + putFood + " еды!");
    }
}
