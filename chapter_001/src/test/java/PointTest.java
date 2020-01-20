package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        int inx1 = 5;
        int iny1 = 6;
        int inx2 = 2;
        int iny2 = 9;
        double expected = 4.24;
        double out = Point.distance(inx1, iny1, inx2, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
