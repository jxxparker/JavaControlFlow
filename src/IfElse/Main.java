package IfElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a grade: ");
		
		int n = scan.nextInt();
		
		if(n >= 90 && n <= 100) {
			System.out.println("A " + n + "%");
		} else if(n >= 80 && n <=89) {
			System.out.println("B " + n + "%");
		}
	}

}
