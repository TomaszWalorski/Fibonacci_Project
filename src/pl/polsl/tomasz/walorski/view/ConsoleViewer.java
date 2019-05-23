package pl.polsl.tomasz.walorski.view;

import pl.polsl.tomasz.walorski.model.TimeConversion;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Class care for graphical part of program
 */
public class ConsoleViewer
{
    /**
     * Method get input data from a user
     * @return returning obtained value of size of series
     */
    public int inputData()
    {
        System.out.println("Enter size of Fibonacci series to generate");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        return size;
    }

    /**
     * Method inform about threat connecting with long time of program's execution
     * @param input it is obtained size of series
     */
    public void warning(int input)
    {
        if(input>30){
            System.out.println("For large size of Fibonacci series algorithms may take long time.");
        }
    }
    /**
     * Method showing final results
     * @param RecursiveTime amount of time of executing recursive algorithm
     * @param IterativeTime amount of time of executing iterative algorithm
     * @param result value of last element of generated series
     * @param size size of generated series
     */
    public void printResults(long RecursiveTime, long IterativeTime, BigInteger result, int size)
    {
        TimeConversion timecon = new TimeConversion();
        System.out.println(size + ". element of Fibonacci Series: " + result.toString() +
                        "\n" + "Recursive Algorithm: " +  timecon.timePrint(RecursiveTime) +
                        "\n" + "Iterative Algorithm: " + timecon.timePrint(IterativeTime));
    }
    /**
     * Method inform about no command line argument.
     * @param counter It is amount of command line arguments.
     */
    public void zeroArgument(int counter)
    {
        if(counter==0) System.out.println("\nZero command line arguments.");
    }

    /**
     * Method inform about which argument is processed.
     * @param counter
     */
    public void whichArgument(int counter)
    {
        System.out.println("\nArgument nr:" + counter);
    }
}
