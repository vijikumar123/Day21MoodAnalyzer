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
        MoodAnalyzerMain moodAnalyzer = new MoodAnalyzerMain();
        String mood = moodAnalyzer.analyseMood("I am In A Sad Mood");
        Assert.assertEquals("SAD", mood);

    }
    // Test case for Happy mood

    @Test
    public void given_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzerMain moodAnalyser = new MoodAnalyzerMain();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY", mood);
    }
}

