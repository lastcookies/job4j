package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book shining = new Book("The Shinig", 447);
        Book fight = new Book("Fight club", 256);
        Book it = new Book("It", 1138);
        Book clean = new Book("Clean code", 324);

        Book[] bk = new Book[4];

        bk[0] = shining;
        bk[1] = fight;
        bk[2] = it;
        bk[3] = clean;

        for (int index = 0; index < bk.length; index++) {
            Book bkOne = bk[index];
            System.out.println(bkOne.getName() + " - " + bkOne.getPage());
        }

        System.out.println("Rearrangement of books on a shelf.");
         Book temp = bk[0];
         bk[0] = bk[3];
         bk[3] = temp;

        for (int index = 0; index < bk.length; index++) {
            Book bkOne = bk[index];
            System.out.println(bkOne.getName() + " - " + bkOne.getPage());
        }

        System.out.println("Show only 'Clean code'");
        for (int index = 0; index < bk.length; index++) {
            Book bkOne = bk[index];
            if (bkOne.getName().equals("Clean code")) {
                System.out.println(bkOne.getName() + " - " + bkOne.getPage());
            }
        }
    }
}
