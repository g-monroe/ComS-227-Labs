package lab3;

public class RabbitModel2
{
  // TODO - add instance variables as needed
  private int population;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel2()
  {
    population = 500;
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
	  int pop = population / 2;
	  population = pop;
  }
  
  /**
   * Sets or resets the state of the model to the 
   * initial conditions.
   */
  public void reset()
  {
    population = 500;
  }
}