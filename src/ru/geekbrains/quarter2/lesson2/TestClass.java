package ru.geekbrains.quarter2.lesson2;

public class TestClass {
    public static void main(String[] args) {
        String[][] stringArray = {{"w","3","2", "3"}, {"8","6","3","i"},{"3","6","8","9"},{"1","3","3","7"}};
        try {
            changeStringToIntAndSum(stringArray);
        }catch (NullPointerException e) {
            System.out.println("Вы ввели массив не верного размера. Размер массива должен быть 4*4");
        }
    }

    public static void changeStringToIntAndSum(String[][] strings) {
        Integer[][] intArray = new Integer[strings.length][strings.length];
        int sum = 0;
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings.length; j++) {
                    if (strings[i].length == 4 && strings[j].length == 4){
                        try {
                            for (int row = 0; row < strings.length; row++) {
                                for (int col = 0; col < strings.length; col++) {
                                    try {
                                        intArray[row][col] = Integer.parseInt(strings[row][col]);
                                    } catch (NumberFormatException e) {
                                    intArray[row][col] = 0;
                                    System.out.println(e.getMessage() + " номер ячейки = " + row + "." + col);
                                    }
                                }
                            }
                        }catch (NullPointerException e){
                            e.getMessage();
                        }
                    }
                    sum += intArray[i][j];
                }
            }
            System.out.println(sum);
    }
}