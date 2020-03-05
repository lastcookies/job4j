package ru.job4j.loop;

public class Mortgage {

    /**
     * расчет, сколько лет будет выплачиваться кредит на определенную с определенной ставкой, годовым доходом
     * @param amount сумма выданная по кредиту
     * @param salary годовой доход
     * @param percent процентная тавка
     * @return сколько лет платить кредит
     */
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double x = amount;
        while (x > 0) {
            x = x * (percent / 100) + x - salary;
            year++;
        }
        return year;
    }
}
