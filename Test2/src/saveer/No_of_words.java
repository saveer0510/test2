package saveer;

import java.util.Scanner;

public class No_of_words {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
String str;		
		System.out.println("Enter a sentence");
		str =sc.nextLine();
		String[]word=str.split(" ");
		String out ="";
		int i=word.length;
		System.out.print("no.of word "+i);
		
}
}