package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, x;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();

        if (a > 0 | a < 0) {
            x = -b / a;
            System.out.println("X = " + x);
        } else {
            if (b > 0 | b < 0) {
                System.out.println("no solutions");
            } else {
                System.out.println("x can be any number");
            }
        }
    }
}
