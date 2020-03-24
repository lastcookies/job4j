package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        Point first = new Point(2, 2);
        Point second = new Point(2, 4);
        Point third = new Point(5, 6);
        Triangle tri = new Triangle(first, second, third);
        double result = tri.area();
        assertThat(result, is(3.000000000000001));
    }

    @Test
    public void whenNoExist() {
        Point first = new Point(2, 2);
        Point second = new Point(2, 2);
        Point third = new Point(3, 3);
        Triangle tri = new Triangle(first, second, third);
        double result = tri.area();
        assertThat(result, is(-1.0));
    }
}



