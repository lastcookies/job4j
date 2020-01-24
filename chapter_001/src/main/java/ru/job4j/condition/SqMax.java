package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int leftside = Max.max(first, second);
        int rightside = Max.max(third, forth);
        return Max.max(leftside, rightside);
    }
}


