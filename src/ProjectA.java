import java.util.Scanner;

public class ProjectA 
{
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Input any two words seperated by a space. I will print as a proper varriable name.");
		String words = userInput.nextLine();
		words = words.toLowerCase().replace(" ", "").toUpperCase().toLowerCase();
		System.out.println(words);
	}
}
