package pkg;

import java.util.List;

public class Trial008 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial008().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        String str = """
                line 1.
                line 2.
                line 3.
                "line 4.with dq."
                """;
        System.out.println(str.endsWith("\n"));
        System.out.println(str);
    }
}
