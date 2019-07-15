package com.company;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework3t2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
      //  Scanner input = new Scanner(new File("C:\\Programs\\levelup\\src\\com\\company\\grooms1.csv"));
       /* System.out.print("How many candidates you will sort? ");
        int s;
        s = input.nextInt();

        candidate[] cand_array = new candidate()[s]; */

        Candidate man = new Candidate();

       short[] iq_array = {150, 152, 10050, 10, 120, 122, 134, 79, 99, 102, 96, 9, 999, 102};

        for (int a = 1; a < iq_array.length; a++) {
            for (int i = 0; i < iq_array.length - a; i++) {
                if (iq_array[i]<iq_array[i+1]){
                    short j = iq_array[i];
                    iq_array[i] = iq_array [i+1];
                    iq_array[i+1] = j;
                   /* System.out.println("j = " +j);
                    System.out.println("i = " +iq_array[i]);
                    System.out.println("i+1 =" +iq_array[i+1]);
                    System.out.print("Now: ");
                    System.out.println(Arrays.toString(iq_array)); */

                    man.iq = iq_array[i];

               }

            }
        }

        String[] groom = {"Sam", "John", "Ralf", "Georg", "Tom", "Cris", "Brian", "David", "Max"};
        for (int s = 0; s < groom.length; s++){
            man.name = groom[s];
        }

        System.out.print("How many candidates you will see on the top? ");
        int t = input.nextInt();

        for (int b = 0; b < t; b++){
            man.name = groom[b];
            man.iq = iq_array[b];
            System.out.println(b+1 + ". " + man.name + "`s IQ is " + iq_array[b]);
        }

        // mit Klasse
        Candidate[] grooms = new Candidate[25];
        for (int c = 0; input.hasNext(); c++){
           // Candidate man = new Candidate();
            man.name = input.next();
            man.iq = input.nextShort();

            System.out.print("name =");
            System.out.println(man.name);
        }
    }
}

class Candidate {
    String name;
    int iq;
}