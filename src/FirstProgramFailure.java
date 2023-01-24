import java.util.Scanner;

/**
 * @author Frank M. Carrano
 * @author Timothy M. Henry
 * @version 5.0
 */
public class FirstProgramFailure{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// demonstrate use of syso and ctrl-space here in eclipse
		// also show ctl-shift-F for format
		// alt-shift-R for rename

		System.out.println("Hello out there.");
		String answer = "yes";
		
		// change this to answer.equals("yes") for program to work!
		
		while (answer.equals("yes") == true) {
			System.out.println("Want to talk some more?");
			System.out.println("Answer yes or no: ");
			answer = keyboard.next();

			if (answer.equals("yes"))
				System.out.println("Nice weather we are having.");
		}

		System.out.println("Good-bye.");
		keyboard.close();
	} 
} 
