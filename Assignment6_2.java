package AssignmentSession6;

import java.util.Scanner;

public class Assignment6_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Hi what's your name?");
		
		String name = input.nextLine();
		
		System.out.println("Hello, " + name + " how old are you?");
		int age = input.nextInt();
		
		try {
		if(age < 0) {
			throw new NegativeAgeException("The age you have entered is a negative number..");
		}
		else {
			System.out.println("That's nice. Okay bye!");
		}
		
		} catch(NegativeAgeException e) {
			System.out.println(e);
		}
}
}

class NegativeAgeException extends Exception {
	
	public  NegativeAgeException(String msg) {
		super(msg);
	}
	}

