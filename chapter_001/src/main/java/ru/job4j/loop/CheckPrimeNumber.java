package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        for (int index = 2; index <= finish; index++) {
            if(index == finish) {
                prime = true;
                break;
            }
            if((finish % index) == 0) {
                break;
            }
        } return prime;
    }
}
