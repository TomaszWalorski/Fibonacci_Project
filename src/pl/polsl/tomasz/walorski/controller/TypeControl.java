package pl.polsl.tomasz.walorski.controller;

/**
 * Class controlling type of input
 */
public class TypeControl
{
    /**
     * Method is handling if type of input parameter is incorrect.
      * @param input Parameter taken from command line arguments.
     * @return Method return true if type of parameter is correct.
     */
    public boolean isCorrectType(String input)
    {
        boolean isCorrect = isInteger(input);

        if(isCorrect)
        {
            try
            {
                isPositive(input);
            }
            catch (FibonacciException e)
            {
                System.out.println(e.getMessage());
                isCorrect = false;
            }
        }

        return isCorrect;
    }
    /**
     * Method throw exception if value of argument is not positive.
     * @param input Parameter taken from command line arguments.
     * @throws FibonacciException
     */
    public void isPositive(String input) throws FibonacciException
    {
        if(Integer.valueOf(input) <= 0)
        {
            throw new FibonacciException("Input value must be positive!");
        }
    }
    /**
     * Method is checking type of input parameter.
     * @param input Parameter taken from command line arguments.
     * @return Method return true if type of parameter is integer.
     */
    public boolean isInteger(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            System.out.println("Input must be integer value!");
            return false;
        }
        return true;
    }
}

