package com.sparta.running.day01.encapsulation.level1;

public class Student {

    private String name = "";

    public String getName() {
        return name;
    }

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0 || score > 100) {
            return;
        }
        this.score = score;
        System.out.println("score: " + score);

    }

    public Student(final String nmae) {
        this.name = name;
    }

}
