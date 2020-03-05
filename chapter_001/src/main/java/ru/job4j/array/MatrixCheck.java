package ru.job4j.array;

/**
 * 6.7.1. Моно строка в матрице.
 * 6.7.2. Моно столбец в матрице.
 * 6.7.3. Диагональ в матрице.
 * 6.7.4. Выйгрышная комбинация в собокан.
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 12.02.2020
 */

public class MatrixCheck {

    /**
     * monoHorizontal - проверяет заполнение строки массива символом 'X'.
     * @param board - размер матрицы
     * @param row - индекс проверяемой строки
     * @return - результат проверки
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[row][index] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * monoVertical - проверяет заполнение столбца матрицы символом 'X'.
     * @param board - размер матрицы
     * @param column - индекс проверяемого столбца
     * @return - результат проверки
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int index = 0; index < board.length; index++) {
            if (board[index][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * extractDiagonal - проверяет заколнение диагонали матрицы символом 'X'.
     * @param board - размер матрицы
     * @return - результат проверки
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int index = 0; index < board.length; index++) {
            rsl[index] = board[index][index];
        }
        return rsl;
    }

    /**
     * isWin - проверяет наличие строк или столбцов, заполненных 'X'.
     * @param board - размер матрицы
     * @return результат проверки
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index < board.length; index++) {
            if (board[index][index] == 'X' && monoHorizontal(board, index) || monoVertical(board, index)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
