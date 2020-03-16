package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic inter = new DummyDic();
        String rus = inter.engToRus("carburetor");
        System.out.println("Неизвестное слово: " + rus);
    }
}
