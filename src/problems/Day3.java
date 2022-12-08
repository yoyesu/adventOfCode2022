package problems;

import utilities.CustomFileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Day3 implements Solvable{


    public static int solveProblem1() throws IOException {
        BufferedReader bfr = CustomFileReader.readInputFile("src/resources/AOC - Day 3.txt");

        //getting the rucksacks
        List<String> rucksacks = new ArrayList<>();
        String line;
        while((line = bfr.readLine()) != null){
            rucksacks.add(line);
        }
        System.out.println("Number of rucksacks: " + rucksacks.size());
        //splitting rucksacks + finding shared items
        String[] pocket1;
        String pocket2 = "";
        List<String> sharedItems = new ArrayList<>();
        for(String rucksack : rucksacks){
            pocket1 = rucksack.substring(0,rucksack.length() / 2).split("");
            pocket2 = rucksack.substring(rucksack.length() / 2);

            for (int i = 0; i < pocket1.length; i++){
                if(pocket2.contains(pocket1[i])){
                    sharedItems.add(pocket1[i]);
                    break;
                }
            }
        }
        //calculating items value
        int sum = 0;

        for(String item : sharedItems){
            int value = item.charAt(0);

            if(value >= 65 && value <= 90){
                value -= 38;
            } else {
                value -= 96;
            }
            sum += value;
        }
        return sum;
    }

    public static int solveProblem2() throws IOException {
        BufferedReader bfr = CustomFileReader.readInputFile("src/resources/AOC - Day 3.txt");

        //getting the rucksacks
        List<String> rucksacks = new ArrayList<>();
        String line;

        while((line = bfr.readLine()) != null){
            rucksacks.add(line);
        }

        List<String[]> groups = new ArrayList<>();
        //grouping rucksacks into 3
        for(String rucksack : rucksacks){
            groups;
        }
        //calculating items value
        int sum = 0;

        for(String item : sharedItems){
            int value = item.charAt(0);

            if(value >= 65 && value <= 90){
                value -= 38;
            } else {
                value -= 96;
            }
            sum += value;
        }
        return sum;
    }
}
