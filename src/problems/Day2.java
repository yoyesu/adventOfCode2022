package problems;

import utilities.CustomFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day2 {
    private static final int PAPER_BY = 2;
    private static final int ROCK_AX = 1;
    private static final int SCISSORS_CZ = 3;
//    private static final int LOSE = 0;
    private static final int DRAW_Y = 3;
    private static final int WIN_Z = 6;
    public static void solveProblem1(){
        // SCISSORS - C Z
        // PAPER - B Y
        // ROCK - A X
        int myToalScore = 0;
        int rivalTotalScore = 0;
        try {
            BufferedReader bfr = CustomFileReader.readInputFile("src/resources/AOC - Day 2.txt");
            List<String> rounds = new ArrayList<>();
            String line;
            while((line = bfr.readLine()) != null){
                rounds.add(line);
            }

            for(String round : rounds){
                if(round.contains("C") && round.contains("Z")){
                    myToalScore += DRAW_Y + SCISSORS_CZ;
                    rivalTotalScore += DRAW_Y + SCISSORS_CZ;
                } else if (round.contains("B") && round.contains("Y")){
                    myToalScore += DRAW_Y + PAPER_BY;
                    rivalTotalScore += DRAW_Y + PAPER_BY;
                } else if (round.contains("A") && round.contains("X")){
                    myToalScore += DRAW_Y + ROCK_AX;
                    rivalTotalScore += DRAW_Y + ROCK_AX;
                } else if (round.contains("A") && round.contains("Y")){
                    myToalScore += WIN_Z + PAPER_BY;
                    rivalTotalScore += ROCK_AX;
                } else if (round.contains("A") && round.contains("Z")){
                    myToalScore += SCISSORS_CZ;
                    rivalTotalScore += WIN_Z + ROCK_AX;
                } else if(round.contains("B") && round.contains("X")){
                    myToalScore += ROCK_AX;
                    rivalTotalScore += WIN_Z + PAPER_BY;
                } else if(round.contains("B") && round.contains("Z")){
                    myToalScore += WIN_Z + SCISSORS_CZ;
                    rivalTotalScore += PAPER_BY;
                } else if(round.contains("C") && round.contains("X")){
                    myToalScore += WIN_Z + ROCK_AX;
                    rivalTotalScore += SCISSORS_CZ;
                } else if(round.contains("C") && round.contains("Y")){
                    myToalScore += PAPER_BY;
                    rivalTotalScore += WIN_Z + SCISSORS_CZ;
                }
            }
            System.out.println("My score: " + myToalScore);
            System.out.println("Rival's score: " + rivalTotalScore);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void solveProblem2(){
        // SCISSORS - C
        // PAPER - B
        // ROCK - A
        // LOSE - X
        //DRAW - Y
        // WIN - Z
        int myToalScore = 0;
        int rivalTotalScore = 0;
        try {
            BufferedReader bfr = CustomFileReader.readInputFile("src/resources/AOC - Day 2.txt");
            List<String> rounds = new ArrayList<>();
            String line;
            while((line = bfr.readLine()) != null){
                rounds.add(line);
            }

            for(String round : rounds){
                if(round.contains("C") && round.contains("Z")){
                    myToalScore += WIN_Z + ROCK_AX;
                    rivalTotalScore += SCISSORS_CZ;
                } else if (round.contains("B") && round.contains("Y")){
                    myToalScore += DRAW_Y + PAPER_BY;
                    rivalTotalScore += DRAW_Y + PAPER_BY;
                } else if (round.contains("A") && round.contains("X")){
                    myToalScore += SCISSORS_CZ;
                    rivalTotalScore += WIN_Z + ROCK_AX;
                } else if (round.contains("A") && round.contains("Y")){
                    myToalScore += DRAW_Y + ROCK_AX;
                    rivalTotalScore += DRAW_Y + ROCK_AX;
                } else if (round.contains("A") && round.contains("Z")){
                    myToalScore += WIN_Z + PAPER_BY;
                    rivalTotalScore += ROCK_AX;
                } else if(round.contains("B") && round.contains("X")){
                    myToalScore += ROCK_AX;
                    rivalTotalScore += WIN_Z + PAPER_BY;
                } else if(round.contains("B") && round.contains("Z")){
                    myToalScore += WIN_Z + SCISSORS_CZ;
                    rivalTotalScore += PAPER_BY;
                } else if(round.contains("C") && round.contains("X")){
                    myToalScore += PAPER_BY;
                    rivalTotalScore += WIN_Z + SCISSORS_CZ;
                } else if(round.contains("C") && round.contains("Y")){
                    myToalScore += DRAW_Y + SCISSORS_CZ;
                    rivalTotalScore += DRAW_Y + SCISSORS_CZ;
                }
            }
            System.out.println("My score: " + myToalScore);
            System.out.println("Rival's score: " + rivalTotalScore);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
