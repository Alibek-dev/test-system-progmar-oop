package com.company;

public class Main {

    public static void main(String[] args) {
        String[] questions = new String[]{
                "Основные принципы объектно-ориентированного программирования? Обведите один вариант.",
                "Что такое первичный ключ (primary key)? Обведите один вариант.",
                "Современные веб-страницы включают в себя код на языке JavaScript. Где происходит исполнение этого кода? Обведите один вариант.",
        };
        String[][] questionsAnswers = new String[][]{
                {"Интерфейс, класс, объект, свойства, методы", "Абстракция, инкапсуляция, наследование, полиморфизм", "Private, protected, public", "Абстракция, Виртуализация, Перегрузка методов, Наследование"},
                {"Порядковый номер записи", "Связь двух таблиц в запросе", "Однозначно идентифицирует каждую запись в таблице", "Контроль доступа к таблице"},
                {"На веб-сервере", "На сервере приложений", "В веб-браузере", "В Java Virtual Machine в операционной системе пользователя"},
        };
        char[] questionKeys = {'2', '3', '3'};
        Question[] answers = new Question[questions.length];

        int iteration = 0;
        for (String question : questions) {
            answers[iteration] = new Question(question, questionsAnswers[iteration], questionKeys[iteration]);
            iteration++;
        }

        TestCore testCore = new TestCore(answers);
        testCore.testing();
    }
}
