//Note: This is intended for beginners who are learning arrays for the first time.

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    int num[] = new int[5];
	    for (int i = 0; i < 5; i++) {
	        
	 		System.out.println("Enter the number: ");
            int number = input.nextInt();
            num[i] = number;
        
	     }
	     System.out.println("----- RESULT ----");
        for (int x = num.length -1; x >= 0 ; x--) {
	       System.out.println(num[x]); 
	         
	     }
	   
	    
	}
}