package lab6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Superiour {
    public static void main(String[] args) {
        AbstractCoach[] abstractCoach = new AbstractCoach[20];
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 3);
            if (k == 0) {
                abstractCoach[i] = new Coach();
            } else if (k == 1) {
                abstractCoach[i] = new LuxCoach();
            } else {
                abstractCoach[i] = new Luggage();
            }
        }
        int numberOfPassengers = 0;
        int numberOfLuggage = 0;
        for (int i = 0; i < abstractCoach.length; i++) {
            System.out.println(abstractCoach[i] + "\n");
            numberOfPassengers += abstractCoach[i].getUsedSeats();
            numberOfLuggage += abstractCoach[i].getLuggage();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Used Seats: %s \nNumber of Luggage: %s\n", numberOfPassengers, numberOfLuggage);
        System.out.println("----------------------------------------------");
        Scanner scanRange = new Scanner(System.in);
        int lowerLimit = scanRange.nextInt();
        int upperLimit = scanRange.nextInt();
        for (int i = 0; i < abstractCoach.length; i++) {
            if (abstractCoach[i].getUsedSeats() <= upperLimit && abstractCoach[i].getUsedSeats() >= lowerLimit) {
                System.out.printf("Carriage number: %s \n%s\n", i, abstractCoach[i]);
            }
        }
        System.out.println("----------------------------------------------");
        Arrays.sort(abstractCoach, new Comparator<AbstractCoach>() {
            @Override
            public int compare(AbstractCoach o1, AbstractCoach o2) {
                if (o1.getComfort().equals("High") && (o2.getComfort().equals("Average") || o2.getComfort().equals("Not Available"))) {
                    return 1;
                } else if (o1.getComfort().equals("Average") && o2.getComfort().equals("Not Available")) {
                    return 1;
                } else if (o1.getComfort().equals("Not Available") && (o2.getComfort().equals("Average") || o2.getComfort().equals("High"))) {
                    return -1;
                } else if (o1.getComfort().equals("Average") && (o2.getComfort().equals("High"))) {
                    return -1;
                }
                return 0;
            }
        });
        for (int i = 0; i < abstractCoach.length; i++) {
            System.out.println("\n" + abstractCoach[i]);
        }
    }
}








