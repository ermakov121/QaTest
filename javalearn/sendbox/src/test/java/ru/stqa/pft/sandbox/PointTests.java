package ru.stqa.pft.sandbox;


import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class PointTests {

    public void TestDistance(){
        Point p1 = new Point(4,8);
        Point p2 = new Point(3,7);
        Assert.assertEquals(p1.distance(p2), "1,41");
    }
}
