package pkg;

import java.util.Random;
import java.util.random.RandomGenerator;

public class Trial001 {
    public static void main(String[] args) {
        System.out.println("execute start.");
        new Trial001().execute();
        System.out.println("execute end.");
    }

    private void execute() {
        // execute logic here.
        Random random = new Random();
        for ( int i = 0; i < 10; i++)
            System.out.println(random.nextInt(1));
    }
}
