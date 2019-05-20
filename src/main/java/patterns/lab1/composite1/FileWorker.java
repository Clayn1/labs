package patterns.lab1.composite1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class FileWorker {
    public static ArrayList splitFolder(String path, ArrayList arrayList) throws IOException {
        ArrayList folderArrayList = new ArrayList();
        Stream<Path> stream = Files.walk(Paths.get(path));
        stream.forEach(arrayList::add);
        arrayList.forEach(Object::toString);
        for (Object dir : arrayList){
            if(Files.isDirectory(Paths.get((String)dir))){
                splitFolder((String)dir,folderArrayList);
            }else if(Files.isRegularFile(Paths.get((String)dir))){

            }
        }
    return arrayList;
    }
}