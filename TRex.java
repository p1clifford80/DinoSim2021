package Dinosaur1;


/**
 * Write a description of class TRex here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TRex extends Dinosaur
{
    // instance variables - replace the example below with your own
    private int numEaten; //  specific to the TRex class and not Dinosaur

    /**
     * Constructor for objects of class TRex
     */
    public TRex()
    {    
        //super() --> Must be the first line of a constructor
        super("TRex"); // Calls the explicit constructor of the parent class       
        this.numEaten = 0;
    }
    
    
    
    public boolean attack(Dinosaur other)
    {
        // Code this method such that if other is a TRex, this wins
        // 50%. If other is Velo, this wins 60%, if a brona, this wins
        // 75%. 
        boolean result = false;
        if(other.getType().equals("TRex"))
        {    
            if(Math.random()>0.5)
                result = true;
        }
        else if(other.getType().equals("Velo"))
        {
             if(Math.random()>0.4)
                result = true;
        }
        else if (other.getType().equals("bronta"))
        {
             if(Math.random()>0.25)
                result = true;
        }
        return result; 
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
       return this.getType()+" "+ this.getWins() +" "+ this.getBattleCount();
    }
}
