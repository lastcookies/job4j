package ru.job4j.tracker;

/**
 * 1.Конструктор по умолчанию
 * 2.Перегрузка конструктора
 * @author Yaroslav Starosrin (9ruk94@bk.ru)
 * @version 1.0
 * @since 6.04.2020
 */

public class Animal {

    public Animal() {
        super();
    }

    public Animal(String name) {
        super();
        System.out.print("Animal ");
    }

    public static void main(String[] args) {
        Predator predator = new Predator("Predator");
        Tiger tiger = new Tiger("Tiger");
    }
}
