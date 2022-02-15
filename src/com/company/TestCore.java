package com.company;

import java.util.Objects;
import java.util.Scanner;

public class TestCore implements TestInterface {
    private final Question[] questions;

    private int correctAnswers;
    private final int countOfQuestions;

    private String enteredVariant;
    private String outputText;

    private final Scanner in;

    public TestCore(Question[] questions, Scanner in) {

        this.questions = questions;
        this.correctAnswers = 0;
        this.countOfQuestions = this.questions.length;
        this.in = in;

        this.outputText = "Неправильный";
    }

    public void testing() {
        int questionNumber = 1;
        for (Question question: questions) {
            question.printQuestionAndVariants(questionNumber);
            inputKey();
            checkInputOption(question);
            printResult();
            if (question.getIsAnsweredCorrectly()) {
                this.correctAnswers++;
            }

            questionNumber++;
        }

        this.printTestingResult();
    }

    public void inputKey() {
        System.out.print("Введите вариант ответа: ");
        this.enteredVariant = this.in.nextLine();
    }

    private void checkInputOption(Question question) {
        if (Objects.equals(this.enteredVariant, Character.toString(question.getCorrectKey()))) {
            question.setAnsweredCorrectly(true);
            this.outputText = "Правильный";
        }
    }

    private void printResult() {
        System.out.println("Ответ: " + this.outputText);
        System.out.println("-------------------------\n");
    }

    private void printTestingResult() {
        System.out.println("Всего вопросов: " + countOfQuestions);
        System.out.println("Правильных ответов: " + correctAnswers);
        System.out.println("Неправильных ответов: " + (countOfQuestions - correctAnswers));
    }
}
