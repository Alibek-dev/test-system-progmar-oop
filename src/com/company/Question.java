package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Question {
    private final String question;
    private final String[] variants;
    private final char correctKey;
    private String enteredVariant;
    private String outputText;

    private boolean isAnsweredCorrectly;

    public boolean getIsAnsweredCorrectly() {
        return isAnsweredCorrectly;
    }

    public Question(String question, String[] variants, char correctKey) {
        this.question = question;
        this.variants = variants;
        this.correctKey = correctKey;

        this.isAnsweredCorrectly = false;
        this.outputText = "Неправильный";
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

    public void inputKey() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вариант ответа: ");
        this.enteredVariant = in.nextLine();

        checkInputOption();
    }

    public void printResult() {
        System.out.println("Ответ: " + this.outputText);
        System.out.println("-------------------------\n");
    }

    private void checkInputOption() {
        if (Objects.equals(this.enteredVariant, Character.toString(this.correctKey))) {
            this.isAnsweredCorrectly = true;
            this.outputText = "Правильный";

        }
    }

}
