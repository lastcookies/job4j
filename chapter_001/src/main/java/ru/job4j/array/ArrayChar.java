package ru.job4j.array;

/**
 * Слово начинается с...
 *
 * @author Yaroslav Starostin
 * @version 1.0
 * @since 4.02.2020
 */

public class ArrayChar {
    /**
     * startWith - проверяет условие, при котором слово начинается с определенной поседовательности
     * @param word
     * @param pref
     * @return
     */
    public static boolean startWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if(pref[index] != word[index]) {
                result = false;
            }
        }
        return result;
    }
}
