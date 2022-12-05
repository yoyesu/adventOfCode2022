import problems.Day1;
import problems.Day2;

import java.io.IOException;

public class Starter {

    public static void start(){
        Day1.solveProblem1();

        System.out.println("Day 1: Problem 2");
        try {
            Day1.solveProblem2();

            System.out.println("Day 2: Problem 1");
            Day2.solveProblem1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
