package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int leftSide = Max.max(first, second);
        int rightSide = Max.max(third, forth);
        return Max.max(leftSide, rightSide);
    }
}


