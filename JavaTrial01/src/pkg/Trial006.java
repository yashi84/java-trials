package pkg;

import java.util.Map;

public class Trial006 {
    public static void main(String[] args) throws Exception {
        System.out.println("execute start.");
        new Trial006().execute();
        System.out.println("execute end.");
    }

    private void execute() throws Exception {
        // execute logic here.
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");

        System.out.println("key: " + map.get("key1"));
        System.out.println("empty: " + map.get(""));
        System.out.println("null: " + map.get(null));
    }
}
