package patterns.lab2.facade.lab2;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class FileSystemFacade {
    private String path;
    public FileSystemFacade(String path) {
        this.path = path;
    }
    public void create() throws IOException {
        DirectoryWorker.create(path + "/dir1");
        DirectoryWorker.create(path + "/dir2");
        FileWorker.open(path + "/file1.txt", true);
        FileWorker.open(path + "/file2.txt", true);
        FileWorker.open(path + "/file3.txt", true);
    }
    public void destroy(){
        DirectoryWorker.rmdir(path + "/dir1");
        DirectoryWorker.rmdir(path + "/dir2");
        FileWorker.delete(path + "/file1.txt");
        FileWorker.delete(path + "/file2.txt");
        FileWorker.delete(path + "/file3.txt");
    }
}
