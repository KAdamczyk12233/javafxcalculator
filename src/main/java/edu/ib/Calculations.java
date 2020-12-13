package edu.ib;

public class Calculations {
    public static double add(double a, double b) {
        a += b;
        return a;
    }

    public static double subtract(double a, double b) {
        a -= b;
        return a;
    }

    public static double multiply(double a, double b) {
        a *= b;
        return a;
    }

    public static double divide(double a, double b) {
        a /= b;
        return a;
    }

    public static double percent(double a) {
        a /= 100;
        return a;
    }
}
