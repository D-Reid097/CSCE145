import java.util.Scanner;
public class Books {

	public static void main(String[] args) {
		
		//allows for the user to give input
		Scanner key = new Scanner(System.in);
		
		//Prompting the user to insert how many books
		System.out.println("How many books did you purchase at BN booksellers this month?");
		
		
		int books = key.nextInt();
		
		//creating an error code when the user inputs a number that is invalid
		if(books <0)
		{
			System.out.println("Error. Exiting the program.");
			System.exit(0);
		}
		
		//inserting the amount of points the user gains if they buy a certain amount of books for that month
		switch(books)
		{
		case 0:
			System.out.println("you have not earned any points yet. Make a purchase to start earning points!");
			break;
		case 1:
			System.out.println("Congratulations!!! You have earned 5 points!");
		break;
		case 2:
			System.out.println("Congratulations!!! You have earned 15 points!");
		break;
		case 3:
			System.out.println("Congratulations!!! You have earned 30 points!");
		break;
		case 4:
			System.out.println("Congratulations!!! You have earned 60 points!");
		break;
		default:
			System.out.println("Congratulations!!! You have earned 60 points!");
		}
		
		}
		

	}


