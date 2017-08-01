package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {
    @Test
    public void calculateScore_returnsScoreForSingleLetter_1() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 1;
        assertEquals(expected, testScrabble.calculateScore("a"));
    }
    @Test
    public void calculateScore_returnsScoreForTwoSameLetters_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("aa"));
    }

    @Test
    public void calculateScore_returnsScoreForTwoDifferentLetters_2() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 2;
        assertEquals(expected, testScrabble.calculateScore("ae"));
    }

    @Test
    public void calculateScore_returnsScoreForThreeDifferentLetters_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("aei"));
    }

    @Test
    public void calculateScore_returnsScoreForAllOneLetters_10() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 10;
        assertEquals(expected, testScrabble.calculateScore("aeioulnrst"));
    }

    @Test
    public void calculateScore_returnsScoreForDifferentScoreLetters_3() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 3;
        assertEquals(expected, testScrabble.calculateScore("ad"));
    }
    @Test
    public void calculateScore_returnsScoreForDifferentScoreLetters_6() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 6;
        assertEquals(expected, testScrabble.calculateScore("aedg"));
    }
    @Test
    public void calculateScore_returnsScoreForAllScoreLetters_33() throws Exception {
        Scrabble testScrabble = new Scrabble();
        Integer expected = 33;
        assertEquals(expected, testScrabble.calculateScore("adbfkjq"));
    }
}