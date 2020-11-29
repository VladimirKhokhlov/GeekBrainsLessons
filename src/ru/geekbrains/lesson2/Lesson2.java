package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        invertArray();
        fillInArray();
        numbersLessThan6Times2();
        fillDiagonalElements();
    }

    public static void invertArray() {
        int[] array = { 1, 0, 1, 0, 0, 1, 0 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i]--;
            }
            else {
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillInArray(){
        int[] array = new int[8];
        array[0] = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + 3;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void numbersLessThan6Times2(){
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] < 6){
                numbers[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void fillDiagonalElements() {
        int[][] array = new int[4][4];
        for (int i = 0; i < array.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < array[i].length; j++) {
                int counter = (array[i].length - 1) - i;
                if (i == j) {
                    array[i][j] = 1;
                } else if (j == counter) {
                    array[i][j] = 1;
                }
                System.out.print(" " + array[i][j]);
            }
        }
    }
}
