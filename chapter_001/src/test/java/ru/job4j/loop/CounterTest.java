package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOnToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat (rsl, is(expected));
    }

    @Test
    public void whenSumEver() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat (rsl, is(expected));
    }

    @Test
    public void whenSumEvenNumbers() {
        int rsl = Counter.sumByEven(1, 75);
        int expected = 30;
        assertThat (rsl, is(expected));
    }

    @Test
    public void whenNoSum() {
        int rsl = Counter.sumByEven(10, 20);
        int expected = 30;
        assertThat (rsl, is(expected));
    }

}
