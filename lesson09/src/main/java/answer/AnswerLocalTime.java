package main.java.answer;

import java.io.DataOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class AnswerLocalTime {
    private final DataOutputStream dataOutputStream;
    public AnswerLocalTime(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }
    public void answer() throws IOException {
        var currentDate = LocalDate.now();
        var currentTime = LocalTime.now().withNano(0);
        var answer =
                String.format("Привiт, поточна дата: %s, поточний час: %s. Кінець зв'язку.  ", currentDate, currentTime);
        dataOutputStream.writeUTF(answer);
    }
}
