package com.cognixia.jump;

public class Switchstatement {

	public static void main(String[] args) {
//		int value = 2;
//		if(value == 1) {
//			System.out.println("value is 1");
//		}else if (value == 2) {
//			System.out.println("value is 2");
//		}else {
//			System.out.println("not 1 or 2");
//		}
		
		int switchValue = 6;
		switch(switchValue) {
			case 1:
				System.out.println("value was 1");
				break;
			case 2:
				System.out.println("value was 2");
				break;
				
			case 3: case 4: case 5:
				System.out.println("was 3, 4 or 5. which was " + switchValue);
				break;
			
			default:
				System.out.println("more than 5");
				break;
		}	
		//create a new switch statement using char instead of int
		//create a new char variable
		//create a switch statement testing for 
		//a b c d e 
		//display a message if any these are found and then break
		//add a default which displays a message saying not found
		
		char charValue = 'Z';
		switch(charValue) {
			case 'A':
				System.out.println("it is A");
				break;
			case 'B': 
				System.out.println("it is B");
				break;
			case 'C':
				System.out.println("it is C");
				break;
			case 'D':
				System.out.println("it is D");
				break;
			default:
				System.out.println("E or something else");
				break;
			}
		
		String month = "Janufary";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("it is " + month);
			break;
		case "july":
			System.out.println("it is " + month);
			break;
			
		default:
			System.out.println("um not sure " + month);
		}
		
	}

}
