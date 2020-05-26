package ReadingUserInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  //setting up scanner
		
		System.out.println("Enter your year of birth: ");
		
		boolean hasNextInt = scanner.hasNextInt();
		if(hasNextInt) {
			int yearOfBirth = scanner.nextInt(); //setting up scanner for birth year
			scanner.nextLine(); //handle next line character(enter key)
			
			
			System.out.println("enter your name: "); 
			String name = scanner.nextLine(); //setting up scanner for name
			
			int age = 2020 - yearOfBirth; //determining how old they are
			
			//--------------------------
			if(age >= 0 && age <= 100) { //if statement to make sure age is between 1-100
				System.out.println("your name is " + name + ", and you are " + age + " years old");

			} else {
				System.out.println("invalid year of birth");
			}
		
		} else {
			System.out.println("unable to parse year of birth");
		}
		 
	
		
		
		
		
		scanner.close();
	}

}
