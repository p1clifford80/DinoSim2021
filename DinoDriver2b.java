

/**
 * Write a description of class DinoDriver2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DinoDriver2b
{
    public static void main(String[] args)
    {
        Dinosaur[] pop = new Dinosaur[25];

        for(int i =0; i< pop.length; i++)
        {
            // double rand = Math.random();// random decimal
            // if(rand < 0.33 ) 
            pop[i] = new TRex();
            // else if ( rand < 0.67 )
            // {
            // pop[i] = new Velo();
            // }
            // else 
            // pop[i] = new Bronta();
            DinoDriver2b.growUp(pop[i]);
        }
        for(int i = 0; i<5; i++)
        {   
            System.out.println("*************  Round "+(i+1) +" *******************");
            DinoDriver2b.battleRound(pop);
        }

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
        int attWins = 0;
        int battles = 0;

        // Traverse the array, and have all dino battle one other random dino.
        for( Dinosaur d : p )
        {
            if(d.getHealth()>0)// only living dinos attack
            {
                int rand = (int)(Math.random()*p.length);

                // Def cannot be attacking dino NOR dead 
                while(p[rand] == d || p[rand].getHealth() == 0)
                {
                    rand = (int)(Math.random()*p.length);
                    System.out.print("Getting different defender --");
                    if( p[rand] == d)
                        System.out.println("Def is attacker.");
                    else
                        System.out.println("Def is dead.");
                }
                battles++;
                //boolean attackerWon = d.attack(p[rand]);
                if(d.attack(p[rand]))
                {
                    d.update(p[rand]);
                    attWins++;
                }
                else
                    p[rand].update(d);
            }
        }

       
      
        System.out.println("\n**************** Attacker Wins "+attWins + " out of "+battles+" battles.\n");

        
    }

    private static void growUp(Dinosaur d)// d = t1, the are aliases
    {
        int rand = (int)(Math.random()*35);
        //d.setBattleCount(rand);
        for(int i = 0; i < rand; i++)
            d.ageUp();    
    }

    
}
