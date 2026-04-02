package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trial009 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial009().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        LocalDate date;
        date = LocalDate.of(2025, 1, 30);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = LocalDate.of(2025, 2, 28);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        date = LocalDate.parse("20250201", formatter);
        System.out.println(date);
        date = date.withDayOfMonth(Math.min((date.lengthOfMonth()), 31));
        System.out.println(date);
    }
}
