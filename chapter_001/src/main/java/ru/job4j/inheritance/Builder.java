package ru.job4j.inheritance;

public class Builder extends Engineer {

    public String toBuild;

    public Builder(String name, String surname, String education, String birthday, String devProject, String toBuild) {
        super(name, surname, education, birthday, devProject);
        this.toBuild = toBuild;
    }

    public String getToBuild() {
        return toBuild;
    }
}
