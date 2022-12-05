import problems.Day1;

import java.io.IOException;

public class Starter {

    public static void start(){
        Day1.solveProblem1();

        System.out.println("Day 1: Problem 2");
        try {
            Day1.solveProblem2();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
