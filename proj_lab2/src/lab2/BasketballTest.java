package lab2;

public class BasketballTest {
	public static void main(String[] args){
		Basketball b;
		b = new Basketball(4.0);
		System.out.println(b.getDiameter());
		System.out.println(b.isDribbleable());
		Basketball b2 = new Basketball(6.0);
		b.inflate();
		System.out.println(b.isDribbleable());  // should be true now
		System.out.println(b2.isDribbleable()); // should still be false
	}
	
}
class Basketball{
	private boolean isInflated;
	private double diameter;
	public Basketball(double givenDiameter){
		isInflated = false;
		diameter = givenDiameter;
	}
	public double getDiameter(){
		return diameter;
	}
	public boolean isDribbleable(){
		return isInflated;
	}
	public double getCircumference(){
		double result = Math.PI * diameter;
		return result;
	}
	public void inflate(){
		isInflated = true;
	}
}
