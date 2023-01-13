package src;

import java.util.*;

public class FileNavigator {
    private final Map<String, List<FileData>> fileMap = new HashMap<>();

    public void add(String filePath, FileData fileData){
        if (filePath == null || fileData == null)
            throw new IllegalArgumentException("File path and file can't be null.");
        if (!filePath.equals(fileData.getFilePath())){
            throw new IllegalArgumentException(fileData.getFileName()+" can't be added. Please check paths.");
        }
        if (fileMap.containsKey(filePath)){
            fileMap.get(filePath).add(fileData);
        } else{
            fileMap.put(filePath, new ArrayList<>(List.of(fileData)));
        }
    }

    public List<FileData> find(String filePath){
        if (fileMap.get(filePath) == null) return new ArrayList<>();
        return fileMap.get(filePath);
    }

    public List<FileData> filterBySize(int fileSize){
        List<FileData> filteredFiles = new ArrayList<>();
        for (List<FileData> subArList : fileMap.values()) {
            for (FileData file: subArList) {
                if (file.getFileSize() <= fileSize){
                    filteredFiles.add(file);
                }
            }
        }
        return filteredFiles;
    }

    public void remove(String filePath){
        fileMap.remove(filePath);
    }

    public List<FileData> sortBySize(){
        List<FileData> sortedFiles = this.filterBySize(Integer.MAX_VALUE);
        sortedFiles.sort(FileData::compareTo);
        return sortedFiles;
    }

    @Override
    public String toString() {
        return fileMap.toString();
    }
}
