package com.bridgelabz;

public class MoodAnalysisException  extends Exception{
    public MoodAnalysisException(String message, Exception_Type type) {
        super(message);

    }

    public enum Exception_Type {
        NULL, EMPTY;
    }

}

