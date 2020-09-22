package ru.qa;

import org.junit.Test;
import org.testng.Assert;
import pawlentin.Square;

public class SquareTests {


    @Test
    public void testArea(){
        Square s = new Square(5);
        Assert.assertEquals(s.area(), 25.0);
    }
}
