package test;

import org.junit.Before;
import org.junit.Test;
import pl.polsl.tomasz.walorski.model.TimeConversion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TimeConversionTest {

    TimeConversion timeConversion;

    @Before
    public void setUp(){
        timeConversion = new TimeConversion();
    }

    @Test
    public void timePrintTestAbnormal() {
        assertEquals(timeConversion.timePrint(-10000),"Error during conversion");
    }

    @Test
    public void timePrintTestNormal() {
        assertNotEquals(timeConversion.timePrint(10000),"Error during conversion");
    }

    @Test
    public void timePrintTestBorder() {
        assertNotEquals(timeConversion.timePrint(0),"Error during conversion");
    }
}