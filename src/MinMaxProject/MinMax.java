package MinMaxProject;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read the numbers from the console entered by the user
		//and print the minimum and maximum number the user has entered
		
		//before the user enteres the number, print enter number
		
		//if user enters an invalid number, break out of the loop and print
		//the minimum and maximum number
		
		Scanner scanner = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
//		boolean first = true;
		
		while(true) {
			System.out.println("enter number: " );
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt == true) {
				int number = scanner.nextInt();
				
//				if(first == true) {
//					first = false;
//					min = number;
//					max = number;
//					
//				} 
				if(number > max) {
					max = number;
				}
				
				if(number < min) {
					min = number;
				}
				
			} else {
				break;
			}
			scanner.nextLine(); //handle input
		}
		System.out.println("min = " + min + ", max =" + max);
		
		scanner.close();
	}

}
