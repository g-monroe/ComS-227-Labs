package lab8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LineNumberer
{
  public static void main(String[] args) throws FileNotFoundException
  {
	URL i = LineNumberer.class.getClassLoader().getResource("story.txt");
	File inp = new File(i.getPath());
	System.out.println("Words: " + readFile(inp));
    Scanner scanner = new Scanner(inp);
    int lineCount = 1;
    
    while (scanner.hasNextLine())
    {
      String line = scanner.nextLine();
      System.out.print(lineCount + " ");
      System.out.println(line);
      lineCount += 1;
    }
    scanner.close();
    System.out.println("Done");
  }
  
  
  public static int readFile (File input) {
	  int count = 0;
	  try {
		  Scanner scanner = new Scanner(input);
		  while (scanner.hasNextLine())
		    {
		      String line = scanner.nextLine();
		      String[] arr = line.split(" ");
		      count += arr.length;
		      
		    }
		  scanner.close();
	  }catch(Exception err) {
		  System.out.println("Erro!");
	  }
	  return count;
  }
  public static void removeDuplicates(ArrayList words) {
	  
	  ArrayList<String> result = null;
	  HashSet<String> unique = new HashSet<String>(words);
	  for (String key : unique) {
	      result.add(key);
	  }
	  //Or
//	  ArrayList<String> temp = words;
//	  result = null;
//	  for(int i = 1; i<temp.size(); i++) {
//		  if (words.get(i -1) != (temp.get(i))) {
//			  if (result.size() > 0) {
//				  for(int j = 0; j < result.size(); j++) {
//					  if (!result.contains(temp.get(i))) {
//						  result.add(temp.get(i - 1));
//					  }
//				  }
//			  }else {
//				  result.add(temp.get(i - 1));
//			  }
//		  }
//	  }
  }
}