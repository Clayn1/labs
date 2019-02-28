package lab6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class superiour {
    public static void main(String[] args) {
        Train[] train = new Train[20];
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 3);
            if (k == 0) {
                train[i] = new Coach();
            } else if (k == 1) {
                train[i] = new LuxCoach();
            } else {
                train[i] = new Luggage();
            }
        }
        int numberOfPassengers = 0;
        int numberOfLuggage = 0;
        for (int i = 0; i < train.length; i++) {
            System.out.println(train[i] + "\n");
            numberOfPassengers += train[i].getUsedSeats();
            numberOfLuggage += train[i].getLuggage();
        }
        System.out.println("----------------------------------------------");
        System.out.printf("Used Seats: %s \nNumber of Luggage: %s\n", numberOfPassengers, numberOfLuggage);
        System.out.println("----------------------------------------------");
        Scanner scanRange = new Scanner(System.in);
        int lowerLimit = scanRange.nextInt();
        int upperLimit = scanRange.nextInt();
        for (int i = 0; i < train.length; i++) {
            if (train[i].getUsedSeats() <= upperLimit && train[i].getUsedSeats() >= lowerLimit) {
                System.out.printf("Carriage number: %s \n%s\n", i, train[i]);
            }
        }
        System.out.println("----------------------------------------------");
        Arrays.sort(train, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
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
        for (int i = 0; i < train.length; i++) {
            System.out.println("\n" + train[i]);
        }
    }
}








