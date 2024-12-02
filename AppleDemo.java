import java.util.Scanner;
public class AppleDemo {

	public static void main(String[] args) {
		Scanner key = new Scanner (System.in);
		String type;
		double weight;
		double price;
		//Welcoming the user
		System.out.println("Welcome to the Apple tester!!!");
		
		System.out.println("Creating the first apple!");
		
		System.out.println("Default vales for the first apple object:");
		
		Apple p1 = new Apple(); // Create an object type of apple

        System.out.println(p1.toString());
        
        System.out.println("\nEnter the type of the second apple:");
        
        type = key.nextLine();
        
        System.out.println("\nEnter the Weight of the second apple:");
        
        weight = key.nextDouble();
        
        System.out.println("\nEnter the price of the second apple:");
        
        price = key.nextDouble();
        
        System.out.println("Creating the second apple object!");
        
       Apple p2 = new Apple(type, weight, price);
       
       System.out.println(p2.toString());
        
        
	}
	
}
