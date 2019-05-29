package patterns.lab1.composite1;

public class Main {
    public static void main(String[] args) {
        ExecutableFile firstFolderFile1 = new ExecutableFile("firstFolderFile1",15);
        ExecutableFile firstFolderFile2 = new ExecutableFile("firstFolderFile2",35);

        Folder folder1 = new Folder("folder1",firstFolderFile1,firstFolderFile2);

        ExecutableFile secondFolderFile1 = new ExecutableFile("secondFolderFile1",87);
        ExecutableFile secondFolderFile2 = new ExecutableFile("secondFolderFile2",156);

        Folder folder2 = new Folder("folder2",folder1,secondFolderFile1, secondFolderFile2);

        ExecutableFile thirdFolderFile1 = new ExecutableFile("thirdFolderFile1",200);

        Folder folder3 = new Folder("folder3",folder2,thirdFolderFile1);

        System.out.println(folder3.getView());
    }
}
