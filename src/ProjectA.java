import java.util.Scanner;

public class ProjectA 
{
	public static void main(String[] args) 
	{
		Scanner stringInput = new Scanner(System.in);
		System.out.println("Input any two words seperated by a space. I will print it as a proper varriable name.");
		
		String words = stringInput.nextLine();
		 words = words.trim();
		   
		  int space = words.indexOf(" ");
		  int len   = words.length();
		   
		  String first = words.substring(0, space);
		  String last = words.substring(space);
		   
		  System.out.println();
		   
		  System.out.println(first.toLowerCase() +last.replace(" ", "").toUpperCase());
	}
}
