package com.example.milllionerew.helper;

import java.util.ArrayList;

public class Questions {
    private ArrayList<Question> questions;

    public Questions() {
        questions = new ArrayList<Question>();

        String[] a = {"A)Джеймсом Гослингом", "B)Брендан Эйх", "C)Илон Маск", "D)Гвидо Ван Россум"};
        questions.add(new Question("Кем был основан язык программирование Java ?", a, 0, 100));

        a = new String[]{"A)Целочисленный поток", "B)Короткий поток", "C)Длинный поток", "D) Поток байтов"};
        questions.add(new Question("Какой из них является тип потока в Java? ", a, 3, 200));

        a = new String[]{"A)Целочисленное значение, присвоенное плавающему типу.", "B)Целочисленное значение, присвоенное плавающему типу.", "C)Значение с плавающей точкой, присвоенное целочисленному типу", "D)Значение с плавающей точкой, присвоенное типу с плавающей точкой."};
        questions.add(new Question("Что такое усечение Java ?", a, 2, 300));

        a = new String[]{"A)Оператор switch более эффективен, чем набор вложенных if.", "B)две константы в одном переключателе могут иметь одинаковые значения", "C)можно создавать вложенные операторы switch.", "D)Оператор switch может проверять на равенство, тогда как if может вычислять любой тип логического выражения."};
        questions.add(new Question("Какое из этих утверждений является правильным?", a, 1, 500));

        a = new String[]{"A)-2147483648 до 2147483647", "B)-32768 до 32767", "C)Ни один из упомянутых", "D)-128 до 127 "};
        questions.add(new Question("Каков диапазон байтов типа данных в Java? ", a, 3, 1000));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
