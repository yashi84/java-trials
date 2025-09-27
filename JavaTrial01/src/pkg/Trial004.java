package pkg;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Trial004 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial004().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        List<String> child1 = List.of("a", "b", "c");
        List<String> child2 = List.of("d", "e");
        List<List<String>> parent = List.of(child1, child2);

        List<String> result = parent.stream()
                .flatMap(Collection::stream)
                .toList();
        System.out.println(result);
    }
}
