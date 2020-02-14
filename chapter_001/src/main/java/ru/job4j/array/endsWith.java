package ru.job4j.array;

/**
 * Слово заканчивается на...
 *
 * @author Starostin Yaroslav
 * @version 1.0
 * @since 6.02.2020
 */

public class EndsWith {
    /**
     * endWith - проверяет условие, при котором слово заначивается на правильную последовательность букв
     * @param word
     * @param post
     * @return
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = 0; index < post.length; index++) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
