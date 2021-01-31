package Dinosaur1;


/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2
{
    public static void main(String[] args)
    {
        Dinosaur[] pop = new Dinosaur[25];
        
        for(int i =0; i< pop.length; i++)
        {
            double rand = Math.random();// random decimal
            if(rand < 0.33 ) 
                pop[i] = new TRex();
            else if ( rand < 0.67 )
            {
                pop[i] = new Velo();
            }
            else 
                pop[i] = new Bronta();
            DinoDriver2.growUp(pop[i]);
        }
        
        DinoDriver2.battleRound(pop);
        
        
        //Output  my population
        //for(int i = 0; i< pop.length; i++)
        for( Dinosaur d : pop )// d gets assigned to pop[i];
        {
            //if(d.getHealth() > 0 )
                System.out.println(d);
        }    
    }
    
    private static void battleRound(Dinosaur[] p)
    {
        /*
        // Modify this code to call the update method with the correct
        // dinos winning and losing.
        System.out.println("\t"+p[0]);
        System.out.println("\t"+p[1]);
        
        */
       
       // Traverse the array, and have all dino battle one other random dino.
       for( Dinosaur d : p )
       {
           int rand = (int)(Math.random()*p.length);
           
            //boolean attackerWon = d.attack(p[rand]);
            if(d.attack(p[rand]))
                d.update(p[rand]);
            else
                p[rand].update(d);
       }
       
        
       
            
      
        //System.out.println("\t"+p[0].attack(p[1]));
        
        
        
    }
    
    private static void growUp(Dinosaur d)// d = t1, the are aliases
    {
        int rand = (int)(Math.random()*35);
        //d.setBattleCount(rand);
        for(int i = 0; i < rand; i++)
            d.ageUp();    
    }
    
    
    
}
