package ru.job4j.inheritance;

public class Dentist extends Doctor {

    public String toTreatTeeth;

    public Dentist(String name, String surname, String education, String birthday, String direction, String toTreatTeeth) {
        super(name, surname, education, birthday, direction);
        this.toTreatTeeth = toTreatTeeth;
    }

    public String getToTreatTeeth() {
        return toTreatTeeth;
    }
}
