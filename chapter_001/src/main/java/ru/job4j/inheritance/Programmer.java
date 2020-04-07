package ru.job4j.inheritance;

public class Programmer extends Engineer {

    public String toProgram;

    public Programmer(String name, String surname, String education, String birthday, String devProject, String toProgram) {
        super(name, surname, education, birthday, devProject);
        this.toProgram = toProgram;
    }

    public String getToProgram() {
        return toProgram;
    }
}
