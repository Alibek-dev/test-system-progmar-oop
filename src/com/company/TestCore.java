package com.company;

public class TestCore implements TestInterface {
    private final Question[] questions;

    private int correctAnswers;
    private final int countOfQuestions;

    public TestCore(Question[] questions) {

        this.questions = questions;
        this.correctAnswers = 0;
        this.countOfQuestions = this.questions.length;
    }

    public void testing() {
        int questionNumber = 1;
        for (Question question: questions) {
            question.printQuestionAndVariants(questionNumber);
            question.inputKey();
            question.printResult();
            if (question.getIsAnsweredCorrectly()) {
                this.correctAnswers++;
            }

            questionNumber++;
        }

        this.printTestingResult();
    }

    private void printTestingResult() {
        System.out.println("Всего вопросов: " + countOfQuestions);
        System.out.println("Правильных ответов: " + correctAnswers);
        System.out.println("Неправильных ответов: " + (countOfQuestions - correctAnswers));
    }
}
