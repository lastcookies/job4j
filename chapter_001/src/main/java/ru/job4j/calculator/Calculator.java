package ru.job4j.calculator;

/**
 * Package for calculate task.
 *
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version [#222468]
 * @since 0.1
 */

public class Calculator {

    /**
     * Addition
     * @param first
     * @param second
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }
    /**
     * Division
     * @param first
     * @param second
     */
    public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }
    /**
     * Multiplication
     * @param first
     * @param second
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }

    /**
     * Subtraction
     * @param first
     * @param second
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    /**
     * main
     * @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
