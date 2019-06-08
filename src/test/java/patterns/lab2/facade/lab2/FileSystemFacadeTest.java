package patterns.lab2.facade.lab2;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

import static org.junit.Assert.*;

public class FileSystemFacadeTest {
    private FileSystemFacade fileSystemFacade;

    @Before
    public void initFacade(){
        fileSystemFacade = new FileSystemFacade("src/main/java/patterns/lab2/facade/lab2");
    }

    @Test
    public void testCreate() throws IOException {
        fileSystemFacade.create();
    }

    @Test
    public void destroy() {
        fileSystemFacade.destroy();
    }

    @Test (expected = WrongTypeException.class)
    public void openWithWrongType() throws IOException {
        FileWorker.open("src/test/java/patterns/lab2/facade/lab2/file1", true);
    }
    @Test
    public void openWithCreate() throws IOException {
        FileWorker.open("src/test/java/patterns/lab2/facade/lab2/file2.txt", true);
    }
    @Test(expected = NoSuchFileException.class)
    public void openNotExistingFile() throws IOException {
        FileWorker.open("src/test/java/patterns/lab2/facade/lab2/file4.txt", false);
    }
    @Test
    public void openExistingFile() throws IOException {
        FileWorker.open("src/test/java/patterns/lab2/facade/lab2/file1.txt", false);
    }
}