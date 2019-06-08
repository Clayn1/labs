package patterns.lab2.facade.lab2;

import org.apache.commons.io.FilenameUtils;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileWorker {

    /**
     *
     * @param path
     * @param createIfNotExist - create file with in given path or clear it
     * @throws WrongTypeException if given path contains to extension
     * @throws IOException if there is no access to file in given path
     * @throws NoSuchFileException if there is no file in given path
     */
    public static void open(String path, boolean createIfNotExist) throws IOException {
        if (FilenameUtils.getExtension(path).equals("")) {
            throw new WrongTypeException();
        }
        File file = new File(path);
        if (!createIfNotExist && !file.exists()) {
            throw new NoSuchFileException("No such file in directory");
        }
        if (createIfNotExist) {
            file.createNewFile();
        }

        Stream<String> stream = Files.lines(Paths.get(path));
        stream.forEach(System.out::println);
    }

    public static void delete(String path){
        File file = new File(path);
        file.delete();
    }
}
