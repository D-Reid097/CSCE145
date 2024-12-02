//Devin Reid
import java.util.Scanner;
public class CoffeeTester {

	public static void main(String[] args) {
	
	Scanner key =new Scanner(System.in);
	String name;
	double caffeine;
	double amount = 0;
	
	System.out.println("Welcome to the Coffee Hour!!!");
	
	System.out.println("What is the name of the first coffee");
	
	name = key.nextLine();
	
	System.out.println("What's the caffeine content?");
	
	caffeine = key.nextDouble();
	
	
	Coffee p1 = new Coffee(name, caffeine, amount);
	
	 System.out.println(p1.toString());
	
	

	}

}
