package patterns.lab1.composite1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Java Projects\\JavaProj\\src\\main\\java\\patterns\\lab1\\composite1\\Folder1\\";
        Stream<Path> stream = Files.walk(Paths.get(path));
        stream.forEach(System.out::println);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayListFiles = new ArrayList();
    }

}

