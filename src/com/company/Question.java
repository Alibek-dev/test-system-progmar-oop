package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Question {
    private final String question;
    private final String[] variants;

    public char getCorrectKey() {
        return correctKey;
    }

    private final char correctKey;

    public void setAnsweredCorrectly(boolean answeredCorrectly) {
        isAnsweredCorrectly = answeredCorrectly;
    }

    private boolean isAnsweredCorrectly;

    public boolean getIsAnsweredCorrectly() {
        return isAnsweredCorrectly;
    }

    public Question(String question, String[] variants, char correctKey) {
        this.question = question;
        this.variants = variants;
        this.correctKey = correctKey;

        this.isAnsweredCorrectly = false;
    }

    public void printQuestionAndVariants(int questionsNumber) {
        System.out.println(questionsNumber + ". " + this.question);
        int variantNumber = 1;
        for (String variant: variants) {
            System.out.println(variantNumber + ") " + variant);
            variantNumber++;
        }
        System.out.println();
    }
}
