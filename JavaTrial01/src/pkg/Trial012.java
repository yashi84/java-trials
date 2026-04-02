package pkg;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

public class Trial012 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial012().execute();
        System.out.println("execute end.");
    }

    private static final List<String> PATTERNS = List.of(
            "yyyyMMdd",
            "yyyyMM",
            ""
    );
    private void execute() throws Exception {
        // execute logic here.
        LocalDateTime now = LocalDateTime.now();
        for ( String pattern: PATTERNS ) {
            String parseResult = parse(now, pattern);
            System.out.println(pattern + ": " + parseResult);
            LocalDate formatResult = format(parseResult, pattern);
            System.out.println(pattern + ": " + formatResult);
        }
    }
    private String parse(LocalDateTime now, String pattern) {
        try {
            return now.format(java.time.format.DateTimeFormatter.ofPattern(pattern));
        } catch (Exception e) {
            return "parse error: " + e.getMessage();
        }
    }
    private LocalDate format(String dateString, String pattern) {
        try {
            return LocalDate.parse(dateString, java.time.format.DateTimeFormatter.ofPattern(pattern));
        } catch (Exception e) {
            return null;
        }
    }
}
