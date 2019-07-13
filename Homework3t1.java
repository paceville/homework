package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3t1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size;
        size = input.nextInt();

        short[] array = new short[size];

        for (int b = 0; b < array.length-1; b++) {
            Random random = new Random();
            array[b] = (short) random.nextInt();
        }
        System.out.print("First array view: ");
        System.out.println(Arrays.toString(array));

        for (int a = 1; a < array.length; a++) {
            for (int i = 0; i < array.length-a; i++) {
                if (array[i] > array[i + 1]) {

                    short j = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = j;
                    // System.out.println("j = " + j);
                    // System.out.println("array i = " + array[i]);
                    // System.out.println("array i+1 = " + array[i + 1]);
                }

            }

        }
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
