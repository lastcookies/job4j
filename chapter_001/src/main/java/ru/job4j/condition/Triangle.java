package ru.job4j.condition;

import static java.lang.Math.sqrt;

/**
 * Площадь треугольника
 *
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 24.03.2020
 */

public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     *Метод должен вычислить периметр треугольника
     * @param a расстояние между точками a и b
     * @param b расстояние между точками a и c
     * @param c расстояние между точками b и с
     * @return p - периметр треугольника
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * метод должен вычислить площадь трекгольника
     * @return s - площадь трегольника
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b , c)) {
            rsl = Math.sqrt(p *(p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет, может ли существовать треугольник с данными длинами сторон
     * @param a расстояние между точками a и b
     * @param b расстояние между точками a и c
     * @param c расстояние между точками c и b
     * @return результат проверки
     */
    private boolean exist(double a, double b, double c) {
        return (a + b) > c && (a + c) > b && (c + b) > a;
    }
}
