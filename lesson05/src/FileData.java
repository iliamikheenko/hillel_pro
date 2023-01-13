package src;

public class FileData implements Comparable<FileData>  {
    private final String fileName;
    private final int fileSize;
    private final String filePath;

    public FileData(String fileName, int fileSize, String filePath) {
        if (fileName == null) throw new IllegalArgumentException("File name can't be null");
        if (filePath == null) throw new IllegalArgumentException("File path can't be null");
        if (fileSize <= 0) throw new IllegalArgumentException("File size must be more than 0.");
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

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "{" +
                fileName +
                ", " + fileSize +
                ", " + filePath +
                "}";
    }

    @Override
    public int compareTo(FileData o) {
        return this.fileSize-o.fileSize;
    }
}
