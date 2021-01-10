package ru.geekbrains.lesson5;

public class Employee {

    public static String fullName;
    public static String position;
    public static String email;
    public static String phoneNumber;
    public static int salary;
    public static int age;

    public Employee (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        Employee.fullName = fullName;
        Employee.position = position;
        Employee.email = email;
        Employee.phoneNumber = phoneNumber;
        Employee.salary = salary;
        Employee.age = age;
    }

    public static void printEmployeeInfo() {
        System.out.println("ФИО: " + fullName + "; должность: " + position + "; email: " + email + "; номер телефона: " + phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
    }


    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Иванов Евгений", "Директор", "ivanov_e_1980@i.com", "+7 (123) 456-78-90", 200000, 55);
        employeesArray[1] = new Employee("Клименко Анастасия", "ГлавБух", "koroleva_mira77@mail.com", "+7 (321) 763-74-71", 90000, 53);
        employeesArray[2] = new Employee("Керей Олег", "Менеджер по продажам", "super_manager_oleg@gmail.com", "+7 (999) 654-87-14", 40000, 24);
        employeesArray[3] = new Employee("Шульга Ольга", "Клинин менеджер", "olga-sh.com", "+7 (852) 567-33-11", 15000, 33);
        employeesArray[4] = new Employee("Криворучкин Константин", "ЗавХоз", "masternavseryki@list.com", "+7 (444) 555-66-77", 25000, 44);

        for (int i = 0; i < employeesArray.length; i++) {
            if (age > 40) {
                printEmployeeInfo();
            }
        }
    }
}