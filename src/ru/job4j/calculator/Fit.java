package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = ((187 - 100) * 1.15);
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = ((170 - 110) * 1.15);
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        short height1 = 170;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 170 is " + woman);

    }
}