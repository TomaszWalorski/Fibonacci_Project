package test;

import org.junit.Before;
import org.junit.Test;
import pl.polsl.tomasz.walorski.model.FibonacciSeries;

import static org.junit.Assert.*;

public class FibonacciSeriesTest {

    FibonacciSeries series;

    @Before
    public void setUp(){
        series = new FibonacciSeries();
    }

    @Test
    public void iterative_recursiveFibonacciElementTestNormal() {
        assertEquals(series.iterativeFibonacciElement(10),series.recursiveFibonacciElement(10));
    }

    @Test
    public void iterative_recursiveFibonacciElementTestAbnormal() {
        assertNotEquals(series.iterativeFibonacciElement(10),series.recursiveFibonacciElement(20));
    }

    @Test
    public void iterative_recursiveFibonacciElementTestBorder() {
        assertNotEquals(series.iterativeFibonacciElement(5),series.recursiveFibonacciElement(6));
    }

    @Test
    public void iterative_recursiveFibonacciSeriesTestNormal() {
        assertEquals(series.iterativeFibonacciSeries(20),series.recursiveFibonacciSeries(20));
    }

    @Test
    public void iterative_recursiveFibonacciSeriesTestAbnormal() {
        assertNotEquals(series.iterativeFibonacciSeries(10),series.recursiveFibonacciSeries(20));
    }

    @Test
    public void iterative_recursiveFibonacciSeriesTestBorder() {
        assertNotEquals(series.iterativeFibonacciSeries(14),series.recursiveFibonacciSeries(15));
    }

}