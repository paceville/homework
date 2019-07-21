package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3t2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many candidates do you have?");
        int amount = input.nextInt();

        Candidate man = new Candidate();

        Candidate grooms[] = new Candidate[amount];
        
        // на этом этапе проблема: в массиве все элементы пустые, в них ничего не записывается

        for (int i = 0; i < grooms.length - 1; i++){
            System.out.println("Input name of candidate");
            man.name = input.next();
            man.iq = (short) ((short) 30 + random.nextInt(90));
            //man = grooms[i];
        }
        System.out.println(Arrays.toString(grooms));

        for (int a = 1; a < grooms.length; a++) {
            for (int i = 0; i < grooms.length - a; i++) {
                Candidate first = grooms[i];
                Candidate second = grooms[i+1];

                if (first.iq < second.iq){
                    short temp = first.iq;
                    first.iq = second.iq;
                    second.iq = temp;
                   System.out.println("temp = " + temp);
                    System.out.println("left (first) = " + first.iq);
                    System.out.println("right (second) =" + second.iq);
                    System.out.print("Now: ");
                    System.out.println(Arrays.toString(grooms));

                }

            }
        }

        System.out.print("How many candidates you will see on the top? ");
        int top = input.nextInt();

        for (int i = 0; i < top; i++){
            System.out.println(i+1 + ". " + man.name + "`s IQ is " + grooms[i]);
        }

    }
}

class Candidate {
    String name;
    short iq;
}
