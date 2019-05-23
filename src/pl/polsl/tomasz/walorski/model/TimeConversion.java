package pl.polsl.tomasz.walorski.model;

/**
 * Class converting obtained time
 */
public class TimeConversion
{
    /**
     * ConvertedTime store converted amount of time
     */
    private long convertedTime;

    public long getConvertedTime() {
        return convertedTime;
    }

    public void setConvertedTime(long convertedTime) {
        this.convertedTime = convertedTime;
    }
    /**
     * Method converting obtained time
     * @param time variable to analysis
     * @return returning converted amount of time
     */
    public int convertingExe(long time)
    {
        int counter=0;
        while( time > 1000 && counter < 4 )
        {
            time /= 1000;
            counter++;
        }
        setConvertedTime(time);
        return counter;
    }
    /**
     *
     * @param time
     * @return
     */
    public String timePrint(long time)
    {
        String timeName;
        switch (convertingExe(time))
        {
            case 0:
                timeName = "ns";
                break;
            case 1:
                timeName = "us";
                break;
            case 2:
                timeName = "ms";
                break;
            case 3:
                timeName = "s";
                break;
            default:
                timeName = "Error during conversion";
        }

        if(getConvertedTime()<0){
            return "Error during conversion";
        }
        String returnString = getConvertedTime() + timeName;
        return returnString;
    }
}