package com.example.milllionerew.helper;

import java.util.ArrayList;

public class Questions {
    private ArrayList<Question> questions;

    public Questions() {
        questions = new ArrayList<Question>();

        String[] a = {"A)Велgикий", "B)Сильный", "C)Всемогущий", "D)Секси Шмекси"};
        questions.add(new Question("Кто такой Камалдин? ", a, 0, 150));

        a = new String[]{"A)6 декабря 2000", "B)6 января 2001", "C)7 ноября 1999", "D)8 сенятбря 2000"};
        questions.add(new Question("Когда родился Камалдин ? ", a, 0, 160));

        a = new String[]{"A)6 декабря 2000", "B)6 января 2001", "C)7 ноября 1999", "D)8 сенятбря 2000"};
        questions.add(new Question("Бргыл ? ", a, 3, 290));

        a = new String[]{"A)6 декабря 2000", "B)6 января 2001", "C)7 ноября 1999", "D)8 сенятбря 2000"};
        questions.add(new Question("Бошыл ? ", a, 3, 290));
        a = new String[]{"A)6 декабря 2000", "B)6 января 2001", "C)7 ноября 1999", "D)8 сенятбря 2000"};
        questions.add(new Question("Былшeweог ? ", a, 3, 290));
        a = new String[]{"A)6 декабря 2000", "B)6 января 2001", "C)7 ноября 1999", "D)8 сенятбря 2000"};
        questions.add(new Question("Быsлолдл ? ", a, 3, 290));
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
