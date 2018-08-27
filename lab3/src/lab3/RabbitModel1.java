package lab3;

public class RabbitModel1
{
  // TODO - add instance variables as needed
  private int population;
  /**
   * Constructs a new RabbitModel.
   */
  public RabbitModel1()
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
    if (population % 5 == 0){
    	population = 1;
    }else{
    	population += 1;
    }
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