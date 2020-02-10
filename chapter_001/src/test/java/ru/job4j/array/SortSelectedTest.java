package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOfThree() {
        int[] input = new int[] {11, 2, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 7, 11};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOfFour() {
        int[] input = new int[] {1, 6, 4, 3};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 4, 6};
        assertThat(result, is(expect));
    }
}
