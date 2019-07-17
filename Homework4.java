package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Homework4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many grooms you will sort? ");
        int amount;
        amount = input.nextInt();

        ArrayList<Man> groom = new ArrayList<>()
        //Man[] groom = new Man [amount];

        for (int i = 0; i <= amount; i++){
            System.out.println("Input groom`s name ");
            String groom_name = input.next();
            groom[i] = new Man(groom_name);
        }


        }

    }

class Man {
    String name;
    int iq;
}