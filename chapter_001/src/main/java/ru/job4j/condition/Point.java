package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double one = Math.pow((x2 - x1), 2);
        double two = Math.pow((y2 - y1), 2);
        double three = one + two;
        return Math.sqrt(three);
    }

    public static void main(String[] args) {
        double result = distance(5, 6, 2, 9);
        System.out.println("result (5, 6) to (2, 9) " + result);
    }
}
