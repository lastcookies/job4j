package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {

    @Test
    public void max() {
        int result = SqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
    @Test
    public void max1() {
        int result = SqMax.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max2() {
        int result = SqMax.max(3, 4, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void max3() {
        int result = SqMax.max(3, 2, 5, 1);
        assertThat(result, is(5));
    }
}
