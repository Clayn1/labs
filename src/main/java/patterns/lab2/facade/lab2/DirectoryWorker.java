package patterns.lab2.facade.lab2;

import java.io.File;

public class DirectoryWorker {
    public static void create(String path){
        new File(path).mkdir();
    }
    public static void rmdir(String path){
        File file = new File(path);
        file.delete();
    }
}
