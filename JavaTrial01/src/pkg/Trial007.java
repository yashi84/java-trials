package pkg;

import java.util.List;
import java.util.Map;

public class Trial007 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial007().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        List<String> list = List.of("a", "b", "c", "d", "e", "f", "g", "h");
        List<String> result = list.stream()
                .map(e -> e + "!")
                .toList();
        System.out.println(result);
    }
}
