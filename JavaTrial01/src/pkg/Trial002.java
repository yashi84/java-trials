package pkg;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Trial002 {
    public static void main(String[] args) {
        System.out.println("execute start.");
        new Trial002().execute();
        System.out.println("execute end.");
    }

    private void execute() {
        // execute logic here.
        List<String> base = List.of("a", "b", "c");
        List<String> items = Arrays.asList(new String[]{"a", "", null});

        for ( String s: items ) {
            System.out.println("item: " + s);
            System.out.println("contains: " + base.contains(s));
        }
    }
}
