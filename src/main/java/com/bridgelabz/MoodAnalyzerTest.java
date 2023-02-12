package com.bridgelabz;

import Com.bridgeLabs.MoodAnalysisException;
import Com.bridgeLabs.MoodAnalyzerMain;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertSame;
import org.junit.Test;

import static org.junit.Assert.assertSame;


public class MoodAnalyzerTest {
    //Test case for Sad mood
    @Test
    public void given_SadMood_Should_Return_SAD() {
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain("I am In Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        assertSame("SAD", mood);
    }
    //Constructor in message should return Happy

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }

    @Test
    public void given_NULLMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain(null);
        String mood = moodAnalyser.analyseMood();
        assertSame("HAPPY", mood);
    }
}

