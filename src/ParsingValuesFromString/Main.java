package ParsingValuesFromString;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberAsString = "2020.3";
		System.out.println(numberAsString);
		
		double number = Double.parseDouble(numberAsString);
		System.out.println("hey " + number);
		
		numberAsString += 1;
		number += 1;
		
		System.out.println("new number " + numberAsString);
		System.out.println("real new number "+ number);
		
		
	}

}
