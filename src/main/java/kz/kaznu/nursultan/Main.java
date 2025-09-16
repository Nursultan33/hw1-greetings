package kz.kaznu.nursultan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5");
        int result = scanner.nextInt();
        if (result == 1) {
            greetings();
        }
        if (result == 2) {
            checkSign(1, 2, 3);
        }
        if (result == 3) {
            selectColour();
        }
        if (result == 4) {
            compareNumbers(1, 2);
        }
        if (result == 5) {
            addOrSubtractAndPrint(1, 2, true);
        }
        if (result != 1 && result != 2 && result != 3 && result != 4 && result != 5) {
            System.out.println("No method");
        }
    }

    public static void greetings() {
        System.out.println("Hello\nword\nfrom\nJava");
    }

    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void selectColour() {
        int data = 100;
        if (data <= 10) {
            System.out.println("Красный");
        }
        if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        }
        if (data > 20) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println("res = " + (initValue + delta));
        } else {
            System.out.println("res = " + (initValue - delta));
        }
    }
}