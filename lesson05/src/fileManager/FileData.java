package src.fileManager;

public final class FileData implements Comparable<FileData>  {
    private final String fileName;
    private final int fileSize;
    private final String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    @Override
    public int compareTo(FileData o) {
        return this.fileSize-o.fileSize;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
