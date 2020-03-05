package ru.job4j.array;

/**
 * Дифрагментация массива.
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 14.02.2020
 */

public class Defragment {

    /**
     * compress - метод, который дифрагментирует массив
     * @param array - массив, который дифрагментируется
     * @return - отдефрагментированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[index] == null && point < array.length) {
                    String temp = array[point];
                    array[point] = array[index];
                    array[index] = temp;
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * main - ручное тестирование метода compress
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
