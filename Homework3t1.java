package com.company;

import java.util.Arrays;

public class Homework3t1 {
    public static void main(String[] args) {}


    /*
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int number = input.nextInt();
    */
        public static void bubble (String[]args){
            double[] array = {0, 14, 10, 9, 8, 6, 55, 4, 3, 1};

            System.out.println(Arrays.toString(array));

         //   for (int a = 1; a < array.length; a--) {
                for (int i = array.length - 1; i > 0; i--) {

                           // if (min != array[0]) {
                         if (array[i] > array[i + 1]) {
                               double j = array[i];
                               //System.out.println(j);
                               array[i] = array[i + 1];
                               array[i + 1] = j;
                               System.out.println("j = " + j);
                               System.out.println("array i = " + array[i]);
                               System.out.println("array i+1 = " + array[i + 1]);
                               //if (int a = array[i]; a <)
                               System.out.println(Arrays.toString(array));
                           }

                     //  } while (a == 0);
                   }

            }

        }

