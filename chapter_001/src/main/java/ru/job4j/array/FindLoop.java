package ru.job4j.array;

/**
 * Поиск индекса в диапазоне.
 *
 * @author Yaroslav Starostin
 * @version 2.0
 * @since 6.02.2020
 */

public class FindLoop {

    /**
     * indexOf - проверяет, есть ли число в массиве
     * @param data
     * @param el
     * @return
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < el; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * indexOf - проверяет, есть ли число в диапазоне чисел внутри массива
     * @param data
     * @param el
     * @param start
     * @param finish
     * @return
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index < finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
