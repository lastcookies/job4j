package ru.job4j.pojo;

/**
 * 3. Массивы и модели.
 *
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 21.04.2020
 */

public class Book {
    private String name;
    private int page;

    public Book(String name, int page) {
        this.name = name;
        this.page = page;
    }

    /**
     * Акцессоры
     * @return значение геттеров.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
