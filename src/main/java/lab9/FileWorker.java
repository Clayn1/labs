package lab9;

import lab6.Train;
import lab7.TrainSet;
import java.io.*;
import java.util.ArrayList;

public class FileWorker {
    public static void saveCollectionToFile(String fileName, TrainSet trainSet) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(trainSet);
            objectOutputStream.close();
            System.out.println("1");
        } catch (FileNotFoundException e) {
            System.out.println("Sorry. LeafFile was not found.");
        } catch (IOException e) {
            System.out.println("Sorry. Problems with writing in the file.");
        }
    }

    public static TrainSet loadCollectionFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            return (TrainSet) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveObjectsToFile(String fileName, Train...trains) {
        File file = new File(fileName);
        try {
            OutputStream outputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            for (Train train : trains) {
                objectOutputStream.writeObject(train);
            }
            objectOutputStream.close();
            System.out.println("2");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Train[] loadObjectsFromFile(String fileName) {
        File file = new File(fileName);
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            ArrayList<Train> trains = new ArrayList<>();
            try {
                while (true) {
                    trains.add((Train) objectInputStream.readObject());
                }
            }catch (EOFException e) {
                return trains.toArray(new Train[0]);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void saveStringToFile(String filename, String string) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(string);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void saveObjectsToTextFile(String filename, Train ...trains) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            for (Train train : trains)
            {
                fileWriter.write(train.toString());
            }
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Train[] loadObjectAsText(String filename){
        try{
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            ArrayList<Train> trainsArrayList = new ArrayList<>();
            String read = new String(bufferedReader.readLine());
            while(read!=null){
                String[] usedSeatsFromTextSplitted = read.split(": ");
                int usedSeatsFromText = Integer.parseInt(usedSeatsFromTextSplitted[1]);
                String[] luggageFromTextSplitted = (bufferedReader.readLine()).split(": ");
                int luggageFromText = Integer.parseInt(luggageFromTextSplitted[1]);
                String[] comfortFromTextSplitted = (bufferedReader.readLine()).split(": ");
                String comfortFromText = comfortFromTextSplitted[1];

                Train train = new Train(usedSeatsFromText,luggageFromText,comfortFromText);
                trainsArrayList.add(train);

                read = bufferedReader.readLine();
            }
            return trainsArrayList.toArray(new Train[]{});
        }catch (IOException e){
            e.printStackTrace();
        }
     return null;
    }
}
