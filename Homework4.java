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

        for (int i = 0; i < amount; i++) {
            Man man = new Man();
            System.out.println("Input groom`s name ");
            man.name = input.next();
            man.iq = 30 + random.nextInt(90);
            groom.add(i, (man));
            System.out.println(Arrays.toString(new ArrayList[]{groom}));

        }

        for (int a = 1; a < groom.size(); a++) {
            for (int i = 0; i < groom.size() - a; i++) {
                Man left = groom.get(i);
                Man right = groom.get(i + 1);

                if (left.iq < right.iq) {

                    int temp = left.iq;
                    left.iq = right.iq;
                    right.iq = temp;

//                    System.out.println("temp = " + temp);
//                    System.out.println("left = " + left);
//                    System.out.println("right = " + right);
//                    System.out.println(Arrays.toString(new ArrayList[]{groom}));

                }

            }
        }
        System.out.println(Arrays.toString(new ArrayList[]{groom}));

        System.out.println("How many grooms you will see on the top?");

        int top = input.nextInt();

        for (int i = 0; i < top; i++) {

            System.out.println(groom.get(i));
        }

    }

}


class Man {
    java.lang.String name;
    int iq;

    @Override
    public String toString(){
        return name + "`s IQ is " + iq;
    }
}
