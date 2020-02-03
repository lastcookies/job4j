package ru.job4j.array;

/**
 *Массив заполнен true или false
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 3.02.2020
 */

public class Check {
    /**
     * mono - условие, в котором проверяется, однородный массив, или нет
     * @param data
     * @return
     */
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == data[0]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
