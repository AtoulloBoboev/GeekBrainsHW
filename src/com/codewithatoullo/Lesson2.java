package com.codewithatoullo;

public class Lesson2 {
    public static void main(String[] args) {

        System.out.println("Task 1:");
        int a = 8;
        int b = 7;
        boolean sumBetween = within10and20(a, b);
        System.out.println(sumBetween);
        System.out.println();

        System.out.println("Task 2:");
        isPosOrNeg(-2);
        System.out.println();

        System.out.println("Task 3:");
        boolean isPos = isNegative(6);
        System.out.println(isPos);
        System.out.println();

        System.out.println("Task 4:");
        printWordTimes("Hello World!", 3);
        System.out.println();



    }

    //Task 1:

    /**
     * Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return 10 < sum && sum <= 20;
    }

    //Task 2:
    /**
     * Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное. З
     * амечание: ноль считаем положительным числом.
     */

    public static void isPosOrNeg(int num) {
        if (num >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

    }

    //Task 3:
    /**
     *Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else  {
            return false;
        }
    }

    //Task 4:
    /**
     * Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    public static void printWordTimes(String word, int times){
        for (int i = 0; i < times; i++){
            System.out.println(word);
        }
    }
}

