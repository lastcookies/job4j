package ru.job4j.condition;

public class Triangle {
    public static boolean exist (double ab, double bc, double ca) {
        boolean condition = ((ab + bc) > ca) && ((ab + ca) > bc) && ((bc + ca) > ab);
        boolean result = condition ? true : false;
        return result;
    }
}