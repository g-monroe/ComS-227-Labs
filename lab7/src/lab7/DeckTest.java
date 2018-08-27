package lab7;
import java.util.*;
public class DeckTest {
	public static void main(String[] args){
			Random rand = new Random();
			Card[] hand = new Card[5];
			
			Deck deck = new Deck(rand);
			Card[] cards = new Card[51];
			cards = deck.select(51);
			
		    for (int i = 0; i < 5; i++)
		    {
		      int index = rand.nextInt(51 - i);
		      hand[i] = cards[index];
		      cards[50 - i] = hand[i];
		      System.out.println(hand[i].toString());
		    }
		    int[] ex = new int[100];
		    for(int i = 0; i<100; i++){
		    	ex[i] = i;
		    }
		   int[] result =  new int[100];
		   result = randomExperiment(1000, 100);
		   for(int i = 0; i<result.length; i++){
			   System.out.println(result[i]);
		   }
	}
	public static int[] getPositiveNumbers(int[] numbers){
		int[] even = new int[numbers.length / 2];
		for(int i = 0; i<numbers.length; i++){
			if (i % 2 == 0 && i != 0){
				even[i / 2] = numbers[i];
			}
		}
		return even;
	}
	public static int[] randomExperiment(int max, int iters){
	    Random rand = new Random();
	    int[] result = new int[iters];
	    for (int i = 0; i<iters; i++){
	    	result[i] = rand.nextInt(max - 1);
	    }
	    return result;
	}
	
}
