package ru.job4j.inheritance;

public class Engineer extends Profession {

    public String devProject;

    public Engineer(String name, String surname, String education, String birthday, String devProject) {
        super(name, surname, education, birthday);
        this.devProject = devProject;
    }

    public String getDevProject() {
        return devProject;
    }
}
