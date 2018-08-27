package lab3;


public class RabbitModel
{
  // TODO - add instance variables as needed
  private int population;
  private int population1;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel()
  {
    population = 0;
    population1 = 0;
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
	  population += 1;
	  population1 = population;
	  population = population + population1;

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