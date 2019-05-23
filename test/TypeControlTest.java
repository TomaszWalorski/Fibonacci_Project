package test;

import org.junit.Before;
import org.junit.Test;
import pl.polsl.tomasz.walorski.controller.FibonacciException;
import pl.polsl.tomasz.walorski.controller.TypeControl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TypeControlTest {

    private TypeControl control;

    @Before
    public void beforeTypeControl() {
        control = new TypeControl();
    }

    @Test
    public void isCorrectTypeTestNormal() {
        assertTrue(control.isCorrectType("10"));
    }

    @Test
    public void isCorrectTypeTestAbnormalFirst() {
        assertFalse(control.isCorrectType("-10"));
    }

    @Test
    public void isCorrectTypeTestAbnormalSecond() {
        assertFalse(control.isCorrectType("xyz"));
    }


    @Test
    public void isCorrectTypeTestBorder() {
        assertFalse(control.isCorrectType("0"));
    }

    @Test(expected = FibonacciException.class)
    public void isPositiveTestBorder()  throws FibonacciException {
        control.isPositive("0");
    }

    @Test(expected = FibonacciException.class)
    public void isPositiveTestAbnormal()  throws FibonacciException {
        control.isPositive("-10");
    }

    @Test
    public void isPositiveTestNormal()  throws FibonacciException {
        control.isPositive("10");
    }

    @Test
    public void isIntegerTestNormal() {
        assertTrue(control.isInteger("20"));
    }

    @Test
    public void isIntegerTestAbnormal() {
        assertFalse(control.isInteger("XYZ"));
    }
}