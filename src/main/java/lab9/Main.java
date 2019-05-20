package lab9;

import lab6.LuxCoach;
import lab6.Train;
import lab7.TrainSet;

public class Main {
    public static void main(String[] args) {
        TrainSet trainSet = new TrainSet();
        Train train1 = new Train(15, 25, "Good");
        trainSet.add(train1);
        LuxCoach train2 = new LuxCoach();
        trainSet.add(train2);
        FileWorker.saveCollectionToFile("1.obj", trainSet);

        FileWorker.saveObjectsToFile("2.obj", train1, train2);

        FileWorker.saveObjectsToTextFile("3.txt", train1, train2);

        System.out.println("Done!");
    }
}
