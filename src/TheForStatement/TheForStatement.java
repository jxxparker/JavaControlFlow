package TheForStatement;

public class TheForStatement {
	public static void main(String[] args) {
		System.out.println(calculateInterest(10000.0, 2.0));
		System.out.println("------------------------");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("loop " + i + " hello!");
		}
		System.out.println("------------------------");
		
		// using the statement, call the calculateInterest method with
		// the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
		//and print the results to the console window.
		for(int i = 2; i < 9; i ++) {
			System.out.println("10000 at " + i +  "% interest = " + calculateInterest(10000.0, i));
		}
		System.out.println("------------------------");
		
		//how would you modify the for loop above to do the same thing as 
		// shown but to start from 8 % and work back to 2%
		for(int i = 8; i >= 2; i --) {
			System.out.println("10000 at " + i +  "% interest = " + calculateInterest(10000.0, i));
		}
		
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
