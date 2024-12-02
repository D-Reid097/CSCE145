//Devin Reid
import java.util.Scanner;

public class lab05 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		
		System.out.println("How many dollars would you like to spend on chocolate from the vending machine?");
		 
		 int dollars= key.nextInt();
		 
		 int chocolate = dollars;
		
		int coupons = dollars;
		
		if(dollars <= 0)
		{
			System.out.println("Ivalid value amount. exiting the program.");
			System.exit(0);
		}
		 
		while( coupons >= 6 )
		{
			coupons -= 5;
			
	        chocolate ++;
	       
		}

		
		System.out.println("You can buy "+ chocolate + " chocolate bars and will have " + coupons + " coupons left.");
		


	}

}
