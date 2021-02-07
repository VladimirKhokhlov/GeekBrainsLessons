package ru.geekbrains.quarter2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneBook {
    public static List<String[]> contacts = new ArrayList<>();

    public static void main(String[] args) {
        add("Хохлов", "+11111");
        add("лярда", "+22222");
        add("бука", "+33333");
        get("бука");
        add("Хохлов", "+11");
        get("Хохлов");
        add("Хохлов", "+1111");
        get("Хохлов");
    }

    public static void add(String lastName, String phoneNumber) {
        for (String[] contact : contacts) {
            if (lastName.equals(contact[0])){
                contacts.toArray();
                contacts.lastIndexOf(phoneNumber);
            }
        }
        contacts.add(new String[] {lastName, phoneNumber});
    }

    public static void get(String lastName){
        for (String[] contact : contacts) {
            if (lastName.equals(contact[0])){
                System.out.println(Arrays.toString(contact));
            if (!(lastName.equals(contact[0]))){
                System.out.println("Вы ввели фамилию не верно");
            }
            }
        }
    }
}