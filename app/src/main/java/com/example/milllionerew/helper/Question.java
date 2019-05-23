package com.example.milllionerew.helper;

public class Question {
    private String question;
    private String[] answers;
    private int rightId;
    private int score;

    public Question(String question, String[] answers, int rightId, int score) {
        this.question = question;
        this.answers = answers;
        this.rightId = rightId;
        this.score = score;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getScore() {
        return score;
    }

    public String getRightAnswer() {
        return answers[rightId];
    }

    public int getRightId() {
        return rightId;
    }
}
