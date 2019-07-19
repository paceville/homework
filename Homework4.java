package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Homework4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many grooms you will sort? ");
        int amount;
        amount = input.nextInt();
        Random random = new Random();

        ArrayList<Man> groom = new ArrayList<>();
        //Man[] groom = new Man [amount];

        Man man = new Man();

        for (int i = 0; i < amount; i++) {
            System.out.println("Input groom`s name ");
            man.name = input.next();
            man.iq = 30 + random.nextInt(90);
            groom.add(i, (man));
            System.out.println("Name: " + man.name + "`s IQ " + man.iq);

        }

        for (int a = 1; a < groom.size(); a++){
            for (int i = 0; i < groom.size()-1; i++) {

                Man left = groom.get(i);
                Man right = groom.get(i + 1);

                if (left.iq < right.iq) {
                    left = groom.get(i + 1);
                    right = groom.get(i);
                    System.out.println("left = " + left);
                    System.out.println("right = " + right);
                }
                //System.out.println("left = " + left);
                //System.out.println("right = " + right);
                //System.out.println(groom.get(i));
                //System.out.println(man.iq);
            }
        }

        System.out.println("How many grooms you will see on the top?");

        int top = input.nextInt();

        //for (int candidates = 0; candidates <= top; candidates++) ;




    }

    static class Man {
        java.lang.String name;
        int iq;
    }
}
