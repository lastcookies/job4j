package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    public String toOperate;

    public Surgeon(String name, String surname, String education, String birthday, String direction, String toOperate) {
        super(name, surname, education, birthday, direction);
        this.toOperate = toOperate;
    }

    public String getToOperate() {
        return toOperate;
    }
}
