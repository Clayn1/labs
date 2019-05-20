package lab9;

import lab6.Train;
import lab7.TrainSet;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        TrainSet trainSet = FileWorker.loadCollectionFromFile("1.obj");
        System.out.println(trainSet.size());

        System.out.println(Arrays.toString(FileWorker.loadObjectsFromFile("2.obj")));

        System.out.println(Arrays.toString(FileWorker.loadObjectAsText("3.txt")));
    }
}
