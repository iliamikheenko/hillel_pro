package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StatisticWriter {
    public static void writeToFile(String text, String bookTitle) {
        try ( BufferedWriter outputFile = new BufferedWriter(
                new FileWriter("lesson07/src/book/" + bookTitle + "_statistic.txt"))){
            outputFile.write(text);
            outputFile.flush();
        } catch (IOException e) {
            System.out.println("Failed writing a new file with statistic. Try again.");
        }
    }
}