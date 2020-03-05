package ru.job4j.array;

/**
 * Сортировка выборкой.
 *
 * @author Starostin Yaroslav
 * @version 1.0
 * @since 10.02.2020
 */

public class SortSelected {

    /**
     * sort - выполняет сортировку чисел в массиве
     * @param data - сортируемый массив чисел
     * @return - отсортированный по возрастанию массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length);
            int index = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
        return data;
    }
}
