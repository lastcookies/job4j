package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Yaroslav");
        student.setSurname("Starostin");
        student.setPatronymic("Konstantinovich");
        student.setGroup("job4j");
        student.setDate("11.01.2020");

        System.out.println("Student " + student.getSurname() + " " + student.getName() + " " + student.getPatronymic() +
                " entered the " + student.getGroup() + " group " + student.getDate());
    }
}
