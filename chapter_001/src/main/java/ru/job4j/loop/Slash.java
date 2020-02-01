package ru.job4j.loop;

/**
 * Крест в псевдографике
 *
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 1.02.2020
 */

public class Slash {

    /**
     * drow - условия, при которых на консоль выводится крест из "0"
     * @param size
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell;
                boolean right = size - 1 == row + cell;
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * main - выводит на консоль проверку выполнения условий метода drow
     * @param args
     */

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }
}
