package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        boolean condition = first > second;
        return condition ? first : second;
    }

    public static int max(int first, int second, int third) {
        boolean condOne = second > third;
        int rslOne = condOne ? second : third;
        boolean condTwo = rslOne > first;
        return condTwo ? rslOne : first;
    }

    public static int max(int first, int second, int third, int fourth) {
        boolean condOne = first > second;
        int rslOne = condOne ? first : second;
        boolean condTwo = third > fourth;
        int rslTwo = condTwo ? third : fourth;
        boolean condThree = rslOne > rslTwo;
        return condThree ? rslOne :rslTwo;
    }
}
