package ru.geekbrains.quarter2.lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneBook {
    public static ArrayList<String[]> contacts = new ArrayList<>();

    public static void main(String[] args) {
        add("Хохлов", "+11111");
        add("лярда", "+22222");
        add("бука", "+33333");
        get("бука");
        add("Хохлов", "+11");
        add("Хохлов", "+1111");
        add("Хохлов", "+1111111111111111");
        get("Хохлов");
        System.out.println(contacts.toString());
    }

    public static void add(String lastName, String phoneNumber) {
        for (String[] contact : contacts) {
            if (lastName.equals(contact[0])){
                contacts.lastIndexOf(phoneNumber);
            }
        }
        contacts.add(new String[] {lastName, phoneNumber});
    }

    public static void get(String lastName){
        for (String[] contact : contacts) {
            if (lastName.equals(contact[0])){
                System.out.println(Arrays.toString(contact));
            }
        }
    }
}