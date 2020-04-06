package ru.job4j.tracker;

/**
 * Конструктор по умолчанию
 * @author Yaroslav Starosrin (9ruk94@bk.ru)
 * @version 1.0
 * @since 6.04.2020
 */

public class Animal {

    public Animal() {
        super();
        System.out.println("Animal ");
    }

    public static void main(String[] args) {
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
