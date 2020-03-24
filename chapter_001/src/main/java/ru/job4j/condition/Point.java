package ru.job4j.condition;

/**
 * 2.1 Рефакторинг - расстояние между точками.
 * 4. Расстояние между точками в трехмерном пространстве
 * @author Yaroslav Starostin (9ruk94@bk.ru)
 * @version 1.0
 * @since 24.03.2020
 */

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    private int x;
    private int y;
    private int z;

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param first координата х
     * @param second координата у
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * Конструктор, который принимает начальное состояние объекта "точка"
     * @param x координата х
     * @param y координата у
     * @param z координата z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Находит расстояние между точками
     * @param that - входящая точка
     * @return - расстояние между точками
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * Находит расстояние между точками в трехмерном пространстве
     * @param that - входящая точка
     * @return - расстояние между точками
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point c = new Point(0, 1, 2);
        Point d = new Point(1, 2, 3);
        double dist = a.distance(b);
        double dist3d = c.distance3d(d);
        System.out.println(dist);
        System.out.println(dist3d);
    }
}
