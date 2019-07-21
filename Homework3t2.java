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


        Candidate grooms[] = new Candidate[amount];


        for (int i = 0; i < amount; i++){
            Candidate man = new Candidate();
            System.out.println("Input name of candidate");
            man.name = input.next();
            man.iq = (short) ((short) 30 + random.nextInt(90));
            grooms[i] = man;
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
            //вопрос с new Candidate[]: создается новый массив, в который передается i элемент массива grooms? зачем?
            System.out.println(Arrays.toString(new Candidate[]{grooms[i]}));
        }

    }
}

class Candidate {
    String name;
    short iq;

    @Override
    public String toString() {
        return name + "`s IQ is " + iq;
    }
}
