package lab3;
import java.util.Random;
public class PersonTest {
	public static void main(String[] args){
		//Part 2
		Person p = new Person("Gavin", 20);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		//I See null and 0
		System.out.println(p.getNameLength());
		//Exception in thread "main"
		
		//Part 3
		int x = 42;
	    String s = "" + x;
	    String s2 = "23Skidoo";
	    int x2 = Integer.parseInt(s2);
	    //Exception is thrown.
	    
	    //Part 4
	    System.out.println(Integer.MAX_VALUE); 
	    System.out.println(Integer.MIN_VALUE); 
	    //Out of bounds exception
	    
	    //Part 5
	    Random rand = new Random(137);
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	    System.out.println(rand.nextInt(6));
	}
}
