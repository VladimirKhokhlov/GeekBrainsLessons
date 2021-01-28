package ru.geekbrains.quarter2.lesson1;

public class Test {

    public static void main(String[] args) {
        Human[] human = {
                new Human("Олег", 15, 50),
                new Human("Жорик", 10, 40),
                new Human("Васёк", 2, 10)
        };
        Robot[] robot = {
                new Robot("Робот № 1", 20, 60),
                new Robot("Робот № 2", 15, 50),
                new Robot("Робот № 3", 5, 15)
        };
        Cat[] cat = {
                new Cat("Барсик", 10, 40),
                new Cat("Мурзик", 8, 30),
                new Cat("Матроскин", 5, 20)
        };

        Treadmill[] treadmillArray = {
                new Treadmill(50,1),
                new Treadmill(40,2),
                new Treadmill(30,3)
        };

        Wall[] wallArray = {
                new Wall(5,1),
                new Wall(8,2),
                new Wall(12,3)
        };
        System.out.println();

        run(human, treadmillArray);
        jump(human, wallArray);
        System.out.println("-----------------------------------");


        run(robot, treadmillArray);
        jump(robot, wallArray);
        System.out.println("-----------------------------------");

        run(cat, treadmillArray);
        System.out.println("-----------------------------------");
        jump(cat, wallArray);
    }


    public static void run(Human[] human, Treadmill[] treadmill) {
        for (Human runningHuman : human) {
            for (Treadmill treadmillArray : treadmill) {
                if (runningHuman.run >= treadmillArray.length) {
                System.out.println(runningHuman.name + " смог пробежать по " + treadmillArray.number + " дорожке");
                } else {
                    System.out.println(runningHuman.name + " не смог пробежать по " + treadmillArray.number + " дорожке");
                }
            }
                System.out.println();
        }
    }

    public static void jump(Human[] human, Wall[] wall) {
        for (Human jumpingHuman : human) {
            for (Wall wallArray : wall) {
                if (jumpingHuman.jump >= wallArray.height) {
                    System.out.println(jumpingHuman.name + " смог перепрыгнуть через " + wallArray.number + " стену");
                } else {
                    System.out.println(jumpingHuman.name + " не смог перепрыгнуть через " + wallArray.number + " стену");
                }
            }
            System.out.println();
        }
    }

    public static void run(Robot[] robot, Treadmill[] treadmill) {
        for (Robot runningRobot : robot) {
            for (Treadmill treadmillArray : treadmill) {
                if (runningRobot.run >= treadmill.length) {
                    System.out.println(runningRobot.name + " смог пробежать по " + treadmillArray.number + " дорожке");
                } else {
                    System.out.println(runningRobot.name + " не смог пробежать по " + treadmillArray.number + " дорожке");
                }
            }
            System.out.println();
        }
    }

    public static void jump(Robot[] human, Wall[] wall) {
        for (Robot jumpingRobot : human) {
            for (Wall wallArray : wall) {
                if (jumpingRobot.jump >= wallArray.height) {
                    System.out.println(jumpingRobot.name + " смог перепрыгнуть через " + wallArray.number + " стену");
                } else {
                    System.out.println(jumpingRobot.name + " не смог перепрыгнуть через " + wallArray.number + " стену");
                }
            }
            System.out.println();
        }
    }

    public static void run(Cat[] cat, Treadmill[] treadmill) {
        for (Cat runningCat : cat) {
            for (Treadmill treadmillArray : treadmill) {
                if (runningCat.run >= treadmill.length) {
                    System.out.println(runningCat.name + " смог пробежать по " + treadmillArray.number + " дорожке");
                } else {
                    System.out.println(runningCat.name + " не смог пробежать по " + treadmillArray.number + " дорожке");
                }
            }
            System.out.println();
        }
    }

    public static void jump(Cat[] cat, Wall[] wall) {
        for (Cat jumpingCat : cat) {
            for (Wall wallArray : wall) {
                if (jumpingCat.jump >= wallArray.height) {
                    System.out.println(jumpingCat.name + " смог перепрыгнуть через " + wallArray.number + " стену");
                } else {
                    System.out.println(jumpingCat.name + " не смог перепрыгнуть через " + wallArray.number + " стену");
                }
            }
            System.out.println();
        }
    }
}