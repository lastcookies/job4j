package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return  value * 60;
    }
    
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar(120);
        int rubles1 = euroToRuble(3);
        int rubles2 = dollarToRuble(7);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar.");
        System.out.println("3 euro are " + rubles1 + " rubles.");
        System.out.println("7 dollar are " + rubles2 + " rubles.");
    }
}
