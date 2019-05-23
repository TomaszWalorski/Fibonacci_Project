package pl.polsl.tomasz.walorski;
import pl.polsl.tomasz.walorski.controller.MainControl;

/**
 *
 * @author Tomasz Walorski
 * @version 3.0
 */

/**
 * Main class for executing whole program.
 */
public class Main {
    /**
     * Method is executing whole program.
     * @param args It is command line arguments.
     */
    public static void main(String[] args)
    {
        MainControl controller = new MainControl();
        controller.exe(args);
    }

}
