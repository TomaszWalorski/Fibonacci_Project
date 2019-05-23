package pl.polsl.tomasz.walorski.controller;

/**
 * verifiable exception class
 */
public class FibonacciException extends Exception {
    /**
     * Empty constructor without parameters.
     */
    public FibonacciException() {
    }
    /**
     * Constructor with message's parameter.
     * @param message Message to display.
     */
    public FibonacciException(String message) {
        super(message);
    }
}
