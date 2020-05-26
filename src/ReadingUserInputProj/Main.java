package ReadingUserInputProj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read 10 numbers from the console entered by the user and print the sum
		//of those numbers
		
		//create a scanner
		
		//use hasNextInt()
		
		//if hasNextInt() returns false, print "invalid number"
		
		//use nextInt()
		
		//print message "enter number"
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		
		while(true) {
			int order = counter + 1;
			System.out.println("enter number # " + order + " :");
			
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				int number = scanner.nextInt();
				counter ++;
				sum += number;
				if (counter == 10) {
					break;
				}
			} else {
				System.out.println("invalid number");
			}
			
			scanner.nextLine(); //handle end of line (enter key)
			
		}
		System.out.println("sum = " + sum);
		scanner.close();
	}

}
