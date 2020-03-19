package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are Gav's food.");
        Cat gav = new Cat();
        gav.giveNick("His name is Gav.");
        gav.eat("His meal is kotleta.");
        gav.show();
        System.out.println("There are Black's food.");
        Cat black = new Cat();
        black.giveNick("His name is Black");
        black.eat("His meal is fish.");
        black.show();
    }
}
