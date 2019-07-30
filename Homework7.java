package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many candidates will you sort?");
        int amount = input.nextInt();

        ArrayList <Candidates> candidates = new ArrayList<>(amount);
        for (int i = 0; i < amount; i++){
            Candidates person = new Candidates();

            System.out.println("Input firstname of person: ");
            person.firstname = input.next();
            candidates.add(i,(person));
        }

    }
}

class Candidates {
    String firstname;
        }
