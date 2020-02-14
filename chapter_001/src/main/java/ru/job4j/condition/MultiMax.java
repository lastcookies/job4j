package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int trird) {
        boolean x = first > second;
        int y = x ? first : second;
        boolean z = y > trird;
        int result = z ? y : trird;
        return result;
    }
}
