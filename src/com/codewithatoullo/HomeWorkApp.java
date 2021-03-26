package com.codewithatoullo;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println("Проверка завершена");
        System.out.println();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 12;
        int sum;
        sum = a + b;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
        System.out.println("Проверка завершена");
        System.out.println();
    }


    public static void printColor() {
        int value = -25;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else if (value > 100) {
            System.out.println("Зеленый");
        }
        System.out.println("Проверка завершена");
        System.out.println();
    }

    public static void compareNumbers() {
        int a = 32;
        int b = 54;
        if (a >= b) {
            System.out.println("a>=b");
        } else if (a < b) {
            System.out.println("a<b");
        }
        System.out.println("Проверка завершена");
        System.out.println();
    }

}
