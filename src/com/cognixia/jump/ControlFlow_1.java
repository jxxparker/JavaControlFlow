package com.cognixia.jump;

public class ControlFlow_1 {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
		System.out.println("--------------------");
		for(int i=0; i<1; i++) {
			System.out.println("loop " + i + " hello!");
		}
		System.out.println("--------------------");
		for(int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + " interest = " + calculateInterest(10000.0, i));

		}
		System.out.println("*--------------------");
		for(int i = 8; i > 2; i--) {
			System.out.println("10,000 at " + i + " interest = " + calculateInterest(10000.0, i));
		}

		System.out.println("*--------------------");
	int count = 0;
    for(int i=10; i<50; i++) {
        if(isPrime(i)) {
            count++;
            System.out.println("Number " + i + " is a prime number");
            if(count == 10) {
                System.out.println("Exiting for loop");
                break;
            }
        }
    }
}
	public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                return false;
            }
        }

        return true;

    }
	
	
	public static double calculateInterest(double amount, double interestRate) {
		return(amount * (interestRate/100));
		
	}
}
