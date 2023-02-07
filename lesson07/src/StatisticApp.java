package src;

import java.io.File;
import java.util.Scanner;

public class StatisticApp {
    public static void main(String[] args) {
        String bookTitle;

        System.out.println("Enter book title:");

        try (Scanner scanner = new Scanner(System.in)){
             bookTitle = scanner.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        File book = new File("lesson07/src/book/" + bookTitle + ".txt");

        if (!book.exists()){
            System.out.println("Book doesn't exist in lesson07/src/book!");
            return;
        }

        StatisticReader stReader = new StatisticReader(book);

        String output =
                "Ten most popular words that have more than 2 characters: " + stReader.getTenWords() + "\n" +
                "Total number of words: " + stReader.countWords() + "\n" +
                "Total number of unique words: " + stReader.countUniqueWords();

        System.out.println(output);
        StatisticWriter.writeToFile(output,bookTitle);
    }
}
