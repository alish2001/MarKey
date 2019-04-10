package supply.exige.markey.classes;

import supply.exige.markey.entries.Class;

public class Calculus extends Class {

    private static final double TEST = 78.571428571428571428571428571429;
    private static final double QUIZ = 21.428571428571428571428571428571;

    public Calculus() {
        super("Calculus");
        MathEntry[] marks = {
                new MathEntry("Intro to Calculus Quiz", "16/17"),
                new MathEntry("Intro to Calculus Test", "42/44"),
                new MathEntry("Derivatives Quiz", "11/15"),
                new MathEntry("Derivatives Test", "33.5/41"),
                new MathEntry("Application of Derivatives Quiz", "16/16"),
                new MathEntry("Application of Derivatives Test", "35/40"),
                new MathEntry("Log Deriv Quiz", "20/24"),
                new MathEntry("Log Deriv Test", "38.5/47"),
                new MathEntry("Potential Quiz", "18/18"),

        };

        int quizes = 0;
        int tests = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i].getName().contains("Quiz")) quizes++;
            if (marks[i].getName().contains("Test")) tests++;
        }

        double quizWeight = QUIZ / quizes;
        double testWeight = TEST / tests;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i].getName().contains("Quiz")) marks[i].setWeightFactor(quizWeight);
            if (marks[i].getName().contains("Test")) marks[i].setWeightFactor(testWeight);
        }

        setMarks(marks);
    }
}