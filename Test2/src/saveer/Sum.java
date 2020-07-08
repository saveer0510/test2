package saveer;

import java.util.Scanner;

public class Sum { 
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
  
   int sum=0;
   int product =1;
   int n;
   char c;
   
  
do {
	   System.out.println("enter the number");
	   n=sc.nextInt();
	
	
		   sum=sum+n;
		   product=product*n;
		   
	   
	   System.out.print("Would you like to continue?(yes/no");
	   c=sc.next().charAt(0);
   }while((c == 'y' || c == 'Y'));
System.out.println("sum="+sum);
System.out.println("product"+product);

}
}
   