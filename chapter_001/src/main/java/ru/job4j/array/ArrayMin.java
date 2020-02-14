package ru.job4j.array;

/**
 *  Поиск минимального числа в массиве.
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 8.02.2020
 */

public class ArrayMin {

    /**
     * findMin - находит минимальное число в массиве
     * @param array
     * @return
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (min > array[index]) {
                min = array[index];
            }
        }
        return min;
    }
}
