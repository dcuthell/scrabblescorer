package models;

import com.oracle.tools.packager.Log;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Map<Character, Integer> scoreValues = new HashMap();

    public Scrabble() {

        char ones[] = {'a', 'e', 'i', 'o', 'u', 'l', 'n', 'r', 's', 't'};
        for (int i = 0; i < ones.length; i++) {
            scoreValues.put(ones[i], 1);
        }

        char twos[] = {'d', 'g'};
        for (int j = 0; j < twos.length; j++) {
            scoreValues.put(twos[j], 2);
        }
        char threes[] = {'b', 'c', 'm', 'p'};
        for (int k = 0; k < threes.length; k++) {
            scoreValues.put(threes[k], 3);
        }
        char fours[] = {'f', 'h', 'v', 'w', 'y'};
        for (int l = 0; l < fours.length; l++) {
            scoreValues.put(fours[l], 4);
        }

        scoreValues.put('k', 5);

        char eights[] = {'j', 'x'};
        for (int l = 0; l < eights.length; l++) {
            scoreValues.put(eights[l], 8);
        }
        char tens[] = {'q', 'z'};
        for (int l = 0; l < tens.length; l++) {
            scoreValues.put(tens[l], 10);
        }
    }

    public Integer calculateScore(String input) {

        char inputArray[] = input.toCharArray();
        int returnValue = 0;
        for (int i = 0; i < inputArray.length; i++) {

            returnValue += scoreValues.get(inputArray[i]);
        }
        return returnValue;
    }
}
