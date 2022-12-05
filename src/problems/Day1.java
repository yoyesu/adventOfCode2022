package problems;

import utilities.CustomFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Day1 {


    public static void solveProblem1(){
        try {
            BufferedReader bfr = CustomFileReader.readInputFile("src/resources/input.txt");
            List<String> numbers = new ArrayList<>();
            String line;
            while((line = bfr.readLine()) != null){
                numbers.add(line);
            }
            int biggestNumber = 0;
            int tempBiggest = 0;
            int temp = 0;
            for (int i = 0; i < numbers.size(); i++){
                if(!Objects.equals(numbers.get(i), "")){
                    temp = Integer.parseInt(numbers.get(i));
                    tempBiggest += temp;

                    biggestNumber = Math.max(tempBiggest, biggestNumber);
                } else {
                    tempBiggest = 0;
                }
            }
            System.out.println("tempBiggest " + tempBiggest);
            System.out.println("biggestNumber " + biggestNumber);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    };

    public static void solveProblem2() throws IOException {
        BufferedReader bfr = CustomFileReader.readInputFile("src/resources/input.txt");
        List<String> numbers = new ArrayList<>();
        String line;
        while((line = bfr.readLine()) != null){
            numbers.add(line);
        }
        List<Integer> biggestNumber = new ArrayList<>();
        int tempBiggest = 0;
        int temp = 0;
        for (int i = 0; i < numbers.size(); i++){
            if(!Objects.equals(numbers.get(i), "")){
                temp = Integer.parseInt(numbers.get(i));
                tempBiggest += temp;
            } else {
                biggestNumber.add(tempBiggest);
                tempBiggest = 0;
            }
        }

        int sum = 0;
        biggestNumber.sort(Integer::compareTo);
        int counter = 0;
        for (int i = biggestNumber.size() -1; counter < 3; i--){
            sum += biggestNumber.get(i);
            counter++;
        }
        System.out.println("calorie sum " + sum);
    }
}
