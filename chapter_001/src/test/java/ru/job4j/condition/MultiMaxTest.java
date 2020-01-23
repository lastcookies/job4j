package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecindMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(6, 3, 5);
        assertThat(result, is(6));
    }
    @Test
    public void whenTrirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 1, 9);
        assertThat(result, is(9));
    }
    @Test
    public void whenNoMax() {
        MultiMax check = new MultiMax();
        int result = check.max(3, 3, 3);
        assertThat(result, is(3));
    }
}
