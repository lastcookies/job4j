package ru.job4j.sort;

public class Same {

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 5, 7};
        int[] second = {2, 3, 4, 7};
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i] == second[j]) {
                    System.out.print(first[i] + " ");
                }
            }
        }
    }
}
