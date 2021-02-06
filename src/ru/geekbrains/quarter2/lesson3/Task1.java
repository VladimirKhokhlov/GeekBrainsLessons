package ru.geekbrains.quarter2.lesson3;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] stringArray = {"Путин", "Балалайка", "Матрёшка", "Водка", "Путин",
                                "Космос", "Горбачёв", "Дед Мороз", "Батон", "Комп",
                                "Путин", "Матроскин", "Водка", "Балалайка", "Чашка",
                                "Новый Год", "Ёлка", "Чашка", "Бензин", "Веснушки", };
        List<String> listArray = Arrays.asList(stringArray);
        Set<String> setArray = new HashSet<>(listArray);
        System.out.println(setArray); //Печать уникальных слов
        for (String s : setArray) {                                             //Печатает количество
            System.out.println(s + ": " + Collections.frequency(listArray, s)); //повторяющихся слов
        }
    }
}
