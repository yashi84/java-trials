package pkg;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Trial010 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial010().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        Short s = Short.valueOf("123");
        int i = s;
        System.out.println(i);
        long l = s;
        System.out.println(l);
    }
}
