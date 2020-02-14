package ru.job4j.array;

/**
 * Двухмерный массив. Таблица умножения.
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 10.02.2020
 */

public class Matrix {
    /**
     * multiple - метод, выполняющий таблицу умножения
     * @param size - размер таблицы
     * @return - матрицу
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

}
