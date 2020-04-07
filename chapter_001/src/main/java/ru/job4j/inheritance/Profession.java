package ru.job4j.inheritance;

/**
 * 3.Реализация профессий в коде
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 7.04.2020
 */

public class Profession {
    public String name;
    public String surname;
    public String education;
    public String birthday;

    /**
     * Конструктор для класса Profession
     * @param name - имя
     * @param surname - фамилия
     * @param education - образование
     * @param birthday - день рождения
     */
    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    /**
     * get-методы для полей
     * @return - значение полей
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getBirthday() {
        return birthday;
    }
}
