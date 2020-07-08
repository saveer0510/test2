package saveer;

import java.util.Scanner;

public class Addtwos {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
String s1,s2,s3;		
		System.out.println("Enter a sentence 1");
		s1=sc.nextLine();
		System.out.println("Enter a sentence 2");
		s2=sc.nextLine();
		s3=s1+" "+s2;
		System.out.print(s3);
	}
}
