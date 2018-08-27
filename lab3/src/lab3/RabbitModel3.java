package lab3;

import java.util.Random;

public class RabbitModel3
{
  // TODO - add instance variables as needed
  private int population;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel3()
  {
    population = 0;
  }  
 
  /**
   * Returns the current number of rabbits.
   * @return
   *   current rabbit population
   */
  public int getPopulation()
  {
    // TODO - returns a dummy value so code will compile
    return population;
  }
  
  /**
   * Updates the population to simulate the
   * passing of one year.
   */
  public void simulateYear()
  {
	  Random rand  = new Random();
	  population += rand.nextInt(10) + 1;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    population = 0;
  }
}