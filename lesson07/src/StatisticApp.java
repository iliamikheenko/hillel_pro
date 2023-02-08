package src;

import java.io.File;
import java.util.Scanner;

public class StatisticApp {
    public static void main(String[] args) {
        String bookTitle;

        System.out.print("Enter book title: ");

        Scanner scanner = new Scanner(System.in);
        bookTitle = scanner.nextLine();
        scanner.close();

        File book = new File("lesson07/src/book/" + bookTitle + ".txt");

        if (!book.exists()){
            System.out.println("Book doesn't exist in lesson07/src/book!");
            return;
        }

        StatisticReader stReader = new StatisticReader(book);

        String statisticTemplate =
                "Ten most popular words that have more than 2 characters: " + stReader.getTenWords() + "\n" +
                "Total number of words: " + stReader.countWords() + "\n" +
                "Total number of unique words: " + stReader.countUniqueWords();

        System.out.println(statisticTemplate);
        StatisticWriter.writeToFile(statisticTemplate, bookTitle);
    }
}
