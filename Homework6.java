package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

public class Homework6 {
    public static void main(String[] args){}
}

abstract class FlightNumber {
    String planeType = "Airbus";
    String planeModel = null;

    SimpleDateFormat flightDate = new SimpleDateFormat("dd-mm-yyyy");
    String flightNumber = null;

}

abstract class Airlines extends FlightNumber {
    int airlines = 0;
}

abstract class Places extends Airlines {
    String departurePlace = null;
    String destinationPlace = null;
}

abstract class Price extends Places {
    int flightPrice = 0;
}

abstract class Booking extends Price{
    public void flightBooking(){
        System.out.println("Booking successful!");
    }
}

abstract class People extends Booking {
    String firstName;
    String lastName;
    SimpleDateFormat birthDay = new SimpleDateFormat("dd-mm-yyyy");

}

class Passenger extends People{

    int passengerClass = 0;
    int passport = 0;

}

class NewBooking extends Booking {
    public static void newBooking() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        Passenger pass = new Passenger();

        // ArrayList<Passenger> = new ArrayList<>();

        System.out.print("What`s your first name?");
        pass.firstName = input.next();

        System.out.println("What`s your last name?");
        pass.lastName = input.next();

           /* NEXT?? type
             System.out.println("What`s date of your birth? (format: dd-mm-yyyy)");
             pass.birthDay = input.(); */

        System.out.println("Where would you fly from? (country)");
        pass.departurePlace = input.next();

        System.out.println("Destination countries are available: Russia, Germany, England, Malta and USA. Select one of them");
        pass.destinationPlace = input.next();

        System.out.println("Select airlines: 1(Easy Jet), 2(Lufthansa), 3(Austrian Airlines), 4(Condor) or 5(Air Malta) ");
        pass.airlines = input.nextInt();

        if (pass.airlines == 1){
            pass.planeModel = "A300";
            System.out.println("Your plane is " + pass.planeType + pass.planeModel);
        } if (pass.airlines == 2) {
            pass.planeModel = "A330neo";
            System.out.println("Your plane is " + pass.planeType + pass.planeModel);
        } if (pass.airlines == 3) {
            pass.planeModel = "A330-800 Neo";
            System.out.println("Your plane is " + pass.planeType + pass.planeModel);
        } if (pass.airlines == 4){
            pass.planeModel = "A350";
            System.out.println("Your plane is " + pass.planeType + pass.planeModel);
        } else {
            pass.planeModel = "A390";
            System.out.println("Your plane is " + pass.planeType + pass.planeModel);
        }

        System.out.println("Select class: 1 (business) or 2 (econom)");
        pass.passengerClass = input.nextInt();

        if (pass.passengerClass == 1){
            pass.flightPrice = 25000 + random.nextInt();
            System.out.println("Price: " + pass.flightPrice);
        }

        pass.flightPrice =  15000 + random.nextInt();
        System.out.println("Price: " + pass.flightPrice);

        System.out.println("Input your passport number: ");
        pass.passport = input.nextInt();

        System.out.println("Please, check your data:");
        System.out.println("Your name: " + pass.firstName);
        System.out.println("Your lastname: " + pass.lastName);
        System.out.println("Your passport: " + pass.passport);
        System.out.println("Your departure place:" + pass.departurePlace);
        System.out.println("Your destination:" + pass.destinationPlace);
        System.out.println("Airlines (1(Easy Jet), 2(Lufthansa), 3(Austrian Airlines), 4(Condor) or 5(Air Malta)):" + pass.airlines);
        System.out.println("Plane:" + pass.planeType + pass.planeModel);
        System.out.println("Class:" + pass.passengerClass + "class");
        System.out.println("Price:" + pass.flightPrice);

        pass.flightBooking();

    }
}
