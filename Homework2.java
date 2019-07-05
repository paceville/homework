package com.company;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, x;

        System.out.print("Enter a: ");
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();

        //ax^2 + bx + c = 0

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("x can be any number");
                } else {
                    System.out.println("no solutions");
                }
            } else {
                x = -c / b;
                System.out.println("x = " + x);
            }
        } else {
            double d = Math.pow(b,2) - (4 * a * c);
            System.out.println("discriminant = " +d);

            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (d == 0){
                x = -b / (2 * a);
                System.out.println("x = "+x);
            } else if (d < 0) {
                System.out.println("no roots");
            }
        }
    }
}