package saveer;

import java.util.Scanner;

public class Reersenuber { public static void main(String[] args) {

    Scanner s =new Scanner(System.in);
	int  reversed = 0;
    int num;
    System.out.print("enter number");
    num = s.nextInt();

    while(num != 0) {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num =num/ 10;
    }

    System.out.println("Reversed Number: " + reversed);
}
}


