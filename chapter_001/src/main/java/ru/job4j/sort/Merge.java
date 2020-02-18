package ru.job4j.sort;

import java.util.Arrays;

/**
 * Объединить два массива.
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 18.02.2020
 */

public class Merge {
    /**
     * merge - объединяет два массива в один, сортируя получившийся массив по возрастанию.
     * @param left - первый массив
     * @param right - второй массив
     * @return - объединенный и отсортированный массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < rsl.length) {
            if (i == left.length) {
                rsl[k] = right[j++];
            } else if (j == right.length) {
                rsl[k] = left[i++];
            } else {
                rsl[k] = left[i] < right[j] ? left[i++] : right[j++];
            }
            k++;
        }
        return rsl;
    }

    /**
     * main - проверяет метод merge
     * @param args
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
