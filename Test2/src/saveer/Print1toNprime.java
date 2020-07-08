package saveer;

import java.util.Scanner;

public class Print1toNprime {
private static Scanner scanner =new Scanner( System.in );
public static void main(String[]args) {
	System.out.println("enter number");
	String input =scanner.nextLine();
	int maxnumber = Integer.parseInt(input);
			System.out.println("list of prime numbers" +maxnumber);
			

	for(int num=2;num<=maxnumber;num++)
		
	{
		boolean isPrime=true;
				for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				isPrime=false;
			    break;
			}
		}
				if(isPrime == true)
					System.out.println(num);

	}
		
	}
}
