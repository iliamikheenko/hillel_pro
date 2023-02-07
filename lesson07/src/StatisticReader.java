package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class StatisticReader {
    private final Map<String,Integer> wordCounter = new HashMap<>();
    public void textToWordCounter(File book){
        try (BufferedReader bookBR = new BufferedReader(new FileReader(book))){
            String line;
            Pattern pattern = Pattern.compile("[^a-zA-Z']");
            while ((line = bookBR.readLine()) != null){
                String[] words = pattern.split(line.trim().replaceAll("\\s+"," "));
                for (String word : words) {
                    word = word.toLowerCase();
                    wordCounter.put(word,wordCounter.getOrDefault(word,0)+1);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int countUniqueWords(){
        return wordCounter.keySet().size();
    }
    public int countWords(){
        return wordCounter.values().stream()
                .mapToInt(s -> s)
                .sum();
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
