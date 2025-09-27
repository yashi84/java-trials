package pkg;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Trial003 {
    public static void main(String[] args) {
        System.out.println("execute start.");
        new Trial003().execute();
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

    @Test
    public void testSuccess() {
        try {
            assertEquals("", "");
        } catch (Exception e) {
            fail("error: " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
        }
    }
    @Test
    public void testFail() {
        try {
            assertEquals("", null);
        } catch (Exception e) {
            fail("error: " + e.getClass().getSimpleName() + " - " + e.getMessage(), e);
        }
    }
    @Test
    public void testFail2() {
        assertEquals("", null);
    }
}
