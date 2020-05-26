package DigitSum;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// write a method with the name sumdigits that has one int parameter
		//called number
		//if parameter is >= 10 then the method should process the 
		//number and return sum of
		//all digits, otherwise return -1 to indicate an invalid value.
	
		//the numbers from 0-9 have 1 digit so we dont want to process them
		//also we dont want to process negative numbers, so also return -1 for negative
		//numbers
		System.out.println(sumDigits(125));
	}
	
	private static int sumDigits(int number) {
		if (number < 10) {
			return -1;
		
		}
		
		int sum = 0;
		//125 > 125/10  = 12 > *10 = 120 > 125-120 = 5
		while (number > 0) {
			int digit = number % 10;
			number = number / 10; 
			sum = sum + digit;
			
			//drop the least-significant digit 
             
		
		}
		
		return sum;
		
		
	}

}
