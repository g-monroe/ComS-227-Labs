package lab2;
public class StringTest {
	public static void main(String[] args){
		//Create New String
		String message;
		message = "Hello, world!";
		System.out.println(message);
		
		//Char At
		char theChar = message.charAt(4);
		System.out.println(theChar);

		theChar = message.charAt(3);
		System.out.println(theChar);
		//largest without getting an Error is the length -1
		
		//Checkpoint
		System.out.println(message.toUpperCase());
		System.out.println(message.substring(0, 5));
		System.out.println(message.replace('o', '*'));
	}
}
