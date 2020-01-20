package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void square() {
        int inp = 4;
        int ink = 1;
        double expected = 1;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);

        int inp1 = 6;
        int ink1 = 2;
        double expected1 = 2;
        double out1 = SqArea.square(inp1, ink1);
        Assert.assertEquals(expected1, out1, 0.01);
    }


}
