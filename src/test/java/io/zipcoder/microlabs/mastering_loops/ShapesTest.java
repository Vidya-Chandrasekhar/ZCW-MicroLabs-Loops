package io.zipcoder.microlabs.mastering_loops;


import org.junit.Assert;
import org.junit.Test;

public class ShapesTest {


    @Test
    public void triangleTest() {
        //: Given
        Shapes shapes = new Shapes();

        //: When
        String returnValue = shapes.triangle(5);
        String expectedValue =
               "triangle()\n" +
                       "*** Output ***\n" +
                       "*\n" +
                       "**\n" +
                       "***\n" +
                       "****\n" +
                       "*****";

        //: Then
        Assert.assertEquals(expectedValue,returnValue);
    }

    @Test
    public void tableSquareTest() {
        //: Given

        //: When

        //: Then
    }
}
