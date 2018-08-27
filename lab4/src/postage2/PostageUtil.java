package postage2;
public class PostageUtil {
	/**
   * Returns the cost of postage for a letter of the given weight.
   * @param weight
   *   given weight in ounces
   * @return
   *   cost of postage for the weight
   */
  public static double computePostage(double weight)
  {
    // TODO
	//Scanner scan = new Scanner(System.in);
	  if (weight <= 1) {//TRUE
		  return .47;
	  }else {//FALSE
		  
		  if (weight > 1) {//TRUE
			  return (.47 + Math.ceil(weight - 1) * .21);
		  }else {//FALSE
			  
			  if (weight > 3.5) {//TRUE
				  return (.94 + Math.ceil(weight - 1) * .21);
			  }else {//FALSE
				  return (.47 + Math.ceil(weight - 1) * .21);
			  }//END(2)
			  
		  }//END(1)
		  
	  }//END(0)
  }
}