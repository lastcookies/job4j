package ru.job4j.condition;

public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if(!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('B');
        }
        if(steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else if(steve.canDrive('B')) {
            System.out.println("Steve works on taxi!");
        } else {
            System.out.println("Steve does not nave a job, but ride on motobike!");
        }
    }
}
