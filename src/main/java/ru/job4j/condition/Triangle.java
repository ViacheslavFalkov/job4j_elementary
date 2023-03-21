package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
                System.out.println(" Total " + result);

    }
}
