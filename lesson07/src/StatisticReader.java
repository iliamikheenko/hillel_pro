package src;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

public class StatisticReader {
    private final Map<String,Integer> wordCounter = new HashMap<>();
    private final Pattern PATTERN_WORD = Pattern.compile("[^a-zA-Z']");

//    public StatisticReader(File book) {
//        var lines = this.textToLines(book);
//        this.linesToWordCounter(lines);
//    }
    public StatisticReader(Path path){
        this.readFile(path);
    }
    private void readFile(Path path){
        try {
            Files.readAllLines(path).stream()
                    .map(line -> PATTERN_WORD.split(line.trim().replaceAll("\\s+", " ")))
                    .flatMap(s -> Arrays.stream(s).map(String::toLowerCase))
                    .forEach(word -> wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1));

        } catch (IOException e) {
            System.out.println("Failed reading the file with text. Try again.");
        }
    }
//    private List<String> textToLines(File book) {
//        List<String> lines = new ArrayList<>();
//        try (BufferedReader inputFile = new BufferedReader(new FileReader(book))) {
//            String line;
//            while ((line = inputFile.readLine()) != null) {
//                lines.add(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Failed reading the file with text. Try again.");
//        }
//        return lines;
//    }
//
//    private void linesToWordCounter(List<String> lines){
//        for (String line : lines) {
//            String[] words = PATTERN_WORD.split(line.trim().replaceAll("\\s+", " "));
//            for (String word : words) {
//                word = word.toLowerCase();
//                wordCounter.put(word, wordCounter.getOrDefault(word, 0) + 1);
//            }
//        }
//    }

    public int countUniqueWords(){
        return wordCounter.keySet().size();
    }

    public int countWords(){
        return wordCounter.values().stream()
                .reduce(Integer::sum)
                .orElse(0);
    }

    public List<String> getTenWords(){
        return wordCounter.entrySet().stream()
                .filter(s -> s.getKey().length() >2)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .map(s -> s.getKey() + ":" + s.getValue() )
                .limit(10)
                .toList();
    }
}