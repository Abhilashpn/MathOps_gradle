package com.github.abhilash.MathOps_gradle;

import org.junit.Assert;
import org.junit.Test;

public class MathOperationTest {

    @Test
    public void addTest() {
        MathOperation mathOperation = new MathOperation();
        int result = mathOperation.add(3,4);
        Assert.assertEquals(7, result);
    }
}
