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
        Shapes shapes = new Shapes();

        //: When
        String returnValue = shapes.tableSquare(4);
        String expectedValue =
               "tableSquare()\n" +
                       "*** Output ***\n" +
                       "|1||2||3||4|\n" +
                       "|2||4||6||8|\n" +
                       "|3||6||9||12|\n" +
                       "|4||8||12||16|";

        //: Then
        Assert.assertEquals(expectedValue,returnValue);
    }

    @Test
    public void tableSquares() {

        //: Given
        Shapes shapes = new Shapes();

        //: When
        String returnValue = shapes.tableSquares(6);
        String expectedValue =
               "\ntableSquares()\n" +
                       "*** Output ***\n"+
                       "|1||2||3||4||5||6|\n" +
                       "|2||4||6||8||10||12|\n" +
                       "|3||6||9||12||15||18|\n" +
                       "|4||8||12||16||20||24|\n" +
                       "|5||10||15||20||25||30|\n" +
                       "|6||12||18||24||30||36|";
        //: Then
        Assert.assertEquals(expectedValue,returnValue);
    }
}
