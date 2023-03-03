package com.bridgelabz.analyser;
import org.junit.Test;
import static org.junit.Assert.*;


public class MoodAnalyserTest {
    @Test
    public void givenSadMood_shouldReturnSad(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in sad mood");
        assertEquals("Sad",result);

    }
    @Test
    public void givenAnyMood_shouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in any mood");
        assertEquals("Happy",result);
    }
    @Test
    public void givenHappyMood_shouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in happy mood");
        assertEquals("Happy",result);
    }
}
