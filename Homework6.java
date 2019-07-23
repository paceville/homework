package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Homework6 {
    public static void main(String[] args){}
}

    interface flightNumber {
        String planeType = null;
        String planeModel = null;
//        int flightDay = 0;
//        int flightMonth = 0;
//        int flightYear = 0;
        SimpleDateFormat flightDate = new SimpleDateFormat("dd-mm-yyyy");
        String flightNumber = null;
    }

    interface airlines {
        String airlines = null;
    }

    interface places {
        String departurePlace = null;
        String destinationPlace = null;

    }

    interface booking {
        public String flightBooking();
    }

    abstract class People implements flightNumber, airlines, places, booking {
        String firstName;
        String lastName;
        SimpleDateFormat birthDay = new SimpleDateFormat("dd-mm-yyyy");
//        int dayOfBirth;
//        int monthOfBirth;
//        int yearOfBirth;

    }

    class Passenger extends People implements flightNumber, airlines, places, booking{

    String passengerClass = null;
    int passport = 0;


        @Override
        public String flightBooking() {
            return null;
        }
    }

    class NewBooking{
        public static void newBooking() {
            Scanner input = new Scanner(System.in);

            Passenger pass = new Passenger();

            ArrayList<Passenger> = new ArrayList<>();

            System.out.print("What`s your first name?");
            pass.firstName = input.next();

            System.out.println("What`s your last name?");
            pass.lastName = input.next();

           /* NEXT?? type
             System.out.println("What`s date of your birth? (format: dd-mm-yyyy)");
             pass.birthDay = input.(); */

            System.out.println("Where would you fly from? (country)");



        }
    }