package pl.polsl.tomasz.walorski.model;

import java.math.BigInteger;
import java.util.Vector;

/**
 *  FibonacciSeries class can to obtain series, using recursive and iterative way.
 *  Variable LastValSeries store a value of last element of generated series
 */
public class FibonacciSeries {

    /**
     * Field contain last value of Fibonacci series.
     */
    private BigInteger lastValSeries;

    /**
     * Constructor set value zero field lastValSeries.
     */
    public FibonacciSeries() {
        lastValSeries = BigInteger.ZERO;
    }

    /**
     * Getter of field lastValSeries.
     *
     * @return Returning value of field lastValSeries.
     */
    public BigInteger getLastValSeries() {
        return lastValSeries;
    }

    /**
     * Setter of field lastValSeries.
     *
     * @param lastValSeries New value of of field lastValSeries.
     */
    public void setLastValSeries(BigInteger lastValSeries) {
        this.lastValSeries = lastValSeries;
    }

    /**
     * Method obtaining recursively only one chosen element of Fibonacci series
     *
     * @param number define which element of series will be returned
     * @return retuning chosen element of series
     */
    public BigInteger recursiveFibonacciElement(int number) {
        if (number > 2) {
            return recursiveFibonacciElement(number - 1).add(recursiveFibonacciElement(number - 2));
        }
        return BigInteger.ONE;
    }

    /**
     * Method generating recursively chosen number of elements of Fibonacci series
     *
     * @param SeriesSize define how big will series become
     * @return returning generated series
     */
    public Vector<BigInteger> recursiveFibonacciSeries(int SeriesSize) {
        Vector<BigInteger> series = new Vector<BigInteger>();
        for (int counter = 1; counter < SeriesSize+1; counter++) {
            series.add(recursiveFibonacciElement(counter));
        }
        return series;
    }

    /**
     * Method returning only one chosen element of Fibonacci series (obtained iteratively)
     *
     * @param number define which element of series will be returned
     * @return returning chosen element of series
     */
    public BigInteger iterativeFibonacciElement(int number) {
        Vector<BigInteger> series = new Vector<BigInteger>(iterativeFibonacciSeries(number));
        BigInteger result = series.elementAt(number - 1);
        return result;
    }

    /**
     * Method obtain chosen number of elements of Fibonacci series (obtained iteratively)
     *
     * @param SeriesSize define how big will series become
     * @return returning generated series
     */
    public Vector<BigInteger> iterativeFibonacciSeries(int SeriesSize) {
        Vector<BigInteger> series = new Vector<BigInteger>();
        for (int counter = 0; counter < SeriesSize; counter++) {
            if (counter < 2) {
                series.add(BigInteger.ONE);
            } else
                series.add(series.elementAt(counter - 1).add(series.elementAt(counter - 2)));
        }
        return series;
    }
    /**
     * Method measure time of executing iterative or recursive algorithm
     *
     * @param number define which element of series will be calculated
     * @return returning amount of time of execution
     */
    public long timeMeasurement(int number, String algorithmType) {

        long start = System.nanoTime();
        BigInteger value;
        switch (algorithmType) {
            case "recursive":
                value = recursiveFibonacciElement(number);
                setLastValSeries(value);
                break;
            case "iterative":
                value = iterativeFibonacciElement(number);
                setLastValSeries(value);
                break;
        }
        long stop = System.nanoTime();
        return (stop - start);
    }
}