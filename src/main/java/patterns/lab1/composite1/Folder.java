package patterns.lab1.composite1;

public class Folder implements GeneralFile {
    private int memory = 0;
    private String fileName;
    private GeneralFile[] filesInFolder;

    public Folder(String fileName, GeneralFile... generalFiles) {
        this.fileName = fileName;
        this.filesInFolder = generalFiles;
        for (int i = 0; i < filesInFolder.length; i++) memory += filesInFolder[i].getMemory();
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public String getView() {
        String output = fileName+ "\t" + getMemory() + "\n{\n";
        for(GeneralFile generalFile : filesInFolder) {
            if (generalFile instanceof ExecutableFile) {
                output += generalFile.getView() + "\t" + generalFile.getMemory() + "\n";
            }else output += generalFile.getView() + "\t" + "\n";
        }
        output += "}";
        return output;
    }
}
