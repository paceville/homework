package com.company;

import java.util.ArrayList;
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

        for (int i = 0; i < amount; i++){
            System.out.println("Input groom`s name ");
            Man man = new Man();
            man.name = input.next();
            man.iq = 30 + random.nextInt(90);
            groom.add(i, (man));
            //System.out.println("Name: " + man.name + "`s IQ " + man.iq);
            
            for ()
        }
        

        }


}

class Man {
    java.lang.String name;
    int iq;
}
