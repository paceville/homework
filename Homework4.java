//package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    public class Homework4 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("How many grooms you will sort? ");
            int amount;
            amount = input.nextInt();

            Man man = new Man();

            ArrayList<Man> groom = new ArrayList<>();
            //Man[] groom = new Man [amount];

            for (int i = 0; i <= amount; i++){
                System.out.println("Input groom`s name: ");
                man.name = input.next();
                groom.set(i, create(man.name));
            }


        }

    }

    class Man {
        String name;
        int iq;
    }
    
    public static create
}
