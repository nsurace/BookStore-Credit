import java.util.Scanner;

public class BookstoreCredit
{
	public static void main(String[] args) 
	{
		//Variables and contants
		String name;
		double gpa;
		double credit;

		//Objects
		Scanner keyboard = new Scanner(System.in);

		//input phase
		System.out.print("Enter your name >> ");
		name = keyboard.nextLine();

		System.out.print("Enter your current GPA >> ");
		gpa = keyboard.nextDouble();

		//output phase
		
		credit = computeCreditInfo(gpa);

		displayCredit(name, gpa, credit);

	}

	public static double computeCreditInfo(double gpa)
	{
		double credit;
		credit = gpa * 10;
		return credit;
	}

	public static void displayCredit(String n, double g, double c)
	{
		System.out.println("Hello, " + n + " your grade point average is " + g + ", and therefore you will recieve a credit of $" + String.format("%.2f", c));
	}
}