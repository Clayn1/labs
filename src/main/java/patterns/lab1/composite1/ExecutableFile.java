package patterns.lab1.composite1;

public class ExecutableFile implements GeneralFile {
    private int memory;
    private String fileName;

    public ExecutableFile(String fileName, int memory) {
        this.memory = memory;
        this.fileName = fileName;
    }

    @Override
    public int getMemory() {
        return memory;
    }

    @Override
    public String getView() {
        return fileName;
    }
}
