package pl.polsl.tomasz.walorski.controller;

import pl.polsl.tomasz.walorski.model.*;
import pl.polsl.tomasz.walorski.view.ConsoleViewer;


/**
 * Class is connecting model with view
 */
public class MainControl
{
    /**
     * Controller execution method.
     * @param args Input parameter taken from main() (command line arguments).
     */
    public void exe(String args[])
    {
        int counter = 0;
        ConsoleViewer viewer = new ConsoleViewer();

        for(String arg : args)
        {
            viewer.whichArgument(counter);
            TypeControl typeControl = new TypeControl();
            if(typeControl.isCorrectType(arg))
            {
                int size = Integer.valueOf(arg);
                viewer.warning(size);
                FibonacciSeries series = new FibonacciSeries();
                long recTime = series.timeMeasurement(size,"recursive");
                long iteTime = series.timeMeasurement(size,"iterative");
                viewer.printResults(recTime, iteTime, series.getLastValSeries(), size);
            }
            counter++;
        }
        viewer.zeroArgument(counter);
    }
}