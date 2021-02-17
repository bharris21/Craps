/**
 * Creates and rolls the die for craps
 *
 * @author Brooklyn Harris
 * @version 2/2/21
 */
import java.util.Random;
public class Die extends Craps
{
    // instance variables - replace the example below with your own
    private int roll;
    /**
     * Constructor for objects of class Die
     * takes in two die and rolls them
     */
    public Die()
    {
        roll = this.roll();
    }
    public int roll()
    {
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
    public int getResult()
    {
        return roll;
    }
}
