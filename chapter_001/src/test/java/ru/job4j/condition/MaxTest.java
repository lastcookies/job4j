package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMaxTo2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMaxTo1Then2() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenNoMax() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxTo1Then3() {
        int result = Max.max(5, 3, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxTo3Then4() {
        int result = Max.max(2, 3,7, 4);
        assertThat(result, is(7));
    }
}
