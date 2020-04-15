package ru.job4j.pojo;

/**
 * 2. Модель данных.
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 15.04.2020
 */


public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String group;
    private String date;

    /**
     * Аксессоры для класса Student
     * @return значение аксессоров
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
