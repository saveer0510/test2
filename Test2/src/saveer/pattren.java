package saveer;

import java.util.Scanner;

public class pattren {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) {

        System.out.println("Enter n: ");

        int n = scanner.nextInt();
        for(int i=0;i<n;i++)
        {
        	
        	for(int j=1;j<=i;j++)
       
        		{
        		System.out.print("*");
        		}
        	System.out.println("*");
        	
        }
    }


}
