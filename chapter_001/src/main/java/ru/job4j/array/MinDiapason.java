package ru.job4j.array;

/**
 * Поиск минимума в диапазоне.
 *
 * @author Starostin Yaroslav
 * @version 1.0
 * @since 9.02.2020
 */

public class MinDiapason {
    /**
     * findMin - находит индекс минимального значения в диапазоне массива
     * @param array
     * @param start
     * @param finish
     * @return
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}