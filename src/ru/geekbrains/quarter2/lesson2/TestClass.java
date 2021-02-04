package ru.geekbrains.quarter2.lesson2;

public class TestClass {

    static int sum = 0;

    public static void main(String[] args) {
        String[][] stringArray = {{"1", "1", "a", "1"}, {"1", "1", "1", "i"}, {"1", "1", "b", "1"}, {"1", "c", "1", "1"}};
        getSum(stringArray);
        System.out.println(sum);
    }

    private static void getSum(String[][] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    foo(stringArray, i, j);
                } catch (MyArraySizeException e) {
                    System.out.println(e.getMessage());
                    return;
                } catch (MyArrayDataException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void foo(String[][] arr, int i, int j) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Wrong size");
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Wrong size");
            }
        }
        try {
            sum += Integer.parseInt(arr[i][j]);
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Wrong symbol in indexes i = " + i + ", j = " + j);
        }
    }
}