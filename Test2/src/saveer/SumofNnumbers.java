package saveer;

import java.util.Scanner;

public class SumofNnumbers {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("enter n");
		int n = scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("The Sum Of "+n+" Numbers are:" + sum);
	}

}
