package saveer;

import java.util.Scanner;

public class Reversestring {

	 public static void main(String args[])
	   {
	      String str;
	      Scanner scan = new Scanner(System.in);
		  
	      System.out.print("Enter Your string : ");
	      str = scan.nextLine();
	      String[]words=str.split(" ");
	String outputString = "";
		
		for (int i = words.length-1; i >= 0; i--)
		{
			
			outputString= outputString + new StringBuffer(words[i]).reverse()+ " ";
		}
		System.out.println(outputString);
		  
	        
	    } 
 }