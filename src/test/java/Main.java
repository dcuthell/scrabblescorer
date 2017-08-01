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

        Scrabble testing = new Scrabble();


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a scrabble word!");

        try {
            String inputted = bufferedReader.readLine();

            Integer output = testing.calculateScore(inputted);
            System.out.println(output);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
