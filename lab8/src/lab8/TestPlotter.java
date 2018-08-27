package lab8;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

import plotter.Plotter;
import plotter.Polyline;
import java.io.*;
import java.net.URL;
public class TestPlotter
{
  public static void main(String[] args) throws FileNotFoundException
  {    
    // make a red square using default line width of one pixel
//    Polyline pl = new Polyline("red");
//    pl.addPoint(new Point(100, 100));
//    pl.addPoint(new Point(200, 100));
//    pl.addPoint(new Point(200, 200));
//    pl.addPoint(new Point(100, 200));
//    pl.addPoint(new Point(100, 100));
//    
//    // make a blue triangle with a line width of 2 pixels
//    Polyline pl2 = new Polyline("blue", 2);
//    pl2.addPoint(new Point(250, 100));
//    pl2.addPoint(new Point(400, 350));
//    pl2.addPoint(new Point(100, 350));
//    pl2.addPoint(new Point(250, 100));
//    
//    // make some green zig-zags with a thick line
//    Polyline pl3 = new Polyline("green", 6);
//    pl3.addPoint(new Point(100, 400));
//    pl3.addPoint(new Point(200, 450));
//    pl3.addPoint(new Point(300, 400));
//    pl3.addPoint(new Point(400, 450));
	  URL i = TestPlotter.class.getClassLoader().getResource("test.txt");
	  ArrayList<Polyline> result = readFile(i.getPath());
	  Plotter plotter = new Plotter();
	  for (Polyline temp : result) {
		  plotter.plot(temp);
	  }
  }
  private static ArrayList<Polyline> readFile(String filename) throws FileNotFoundException {
		File inp = new File(filename);
	    Scanner scanner = new Scanner(inp);
	    ArrayList<Polyline> result = new ArrayList<Polyline>();
	    while (scanner.hasNextLine())
	    {
	      
	      String line = scanner.nextLine();
	      if (!line.startsWith("#") && line.length() > 1){
	    	  
	    	  String[] arr = line.split(" ");
	    	  int pSize = 1;
	    	  String color = "red";
	    	  int start = 0;
	    	  if (arr[0].length() == 1){
	    		  pSize = Integer.parseInt(arr[0]);
	    		  color = arr[1];
	    		  start = 2;
	    	  }else{
	    		  color = arr[0];
	    		  start = 1;
	    	  }
	    	  Polyline obj = new Polyline(color, pSize);
		      for(int i = start; i + 1< arr.length; i+= 2){
		    	  int x = Integer.parseInt(arr[i]);
		    	  int y = Integer.parseInt(arr[i + 1]);
		    	  obj.addPoint(new Point(x,y));
		      }
		      result.add(obj);
	      }
	    }
	    scanner.close();
	    System.out.println("Done");
	  
	return result;
	  
	  }
}