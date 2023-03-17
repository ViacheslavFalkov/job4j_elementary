package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minAnddelen(double first, double second) {
        return min(first, second) + delen(first, second);
    }

    public static double summaAndAll(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + min(first, second)
                + delen(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minAnddelen(10, 20));
        System.out.println("Результат расчета равен: " + summaAndAll(10, 20));
    }
}
