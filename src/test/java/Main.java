import jdk.internal.util.xml.impl.Input;
import models.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Scrabble testing = new Scrabble();
        boolean programRunning = true;

        while (programRunning) {
            String navChoice = "";

            try {
                System.out.println("Please enter a scrabble word!");
                String inputted = bufferedReader.readLine();

                Integer output = testing.calculateScore(inputted);
                System.out.println(output);
                System.out.println("Go again? Hit 'y' to continue");
                navChoice = bufferedReader.readLine();
                if (navChoice.equals("y") || navChoice.equals("Y")) {
                    programRunning = true;
                } else {
                    System.out.println("Goodbye!");
                    programRunning = false;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
