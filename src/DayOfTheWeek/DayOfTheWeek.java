package DayOfTheWeek;

public class DayOfTheWeek {
	public static void main(String[] args) {
		printDayOfTheWeek(5);
		printDayOfTheWeek1(1);
	}
	
	private  static void printDayOfTheWeek(int day) {
		switch(day) {
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("invalid");
				
			
		}
	}
	private static void printDayOfTheWeek1(int day) {
		if(day == 0) {
			System.out.println("sunday");
		} else if (day == 1) {
			System.out.println("monday");
		} else if (day == 2) {
			System.out.println("tuesday");
		} else if (day == 3) {
			System.out.println("wednesday");
		} else if (day == 4) {
			System.out.println("thursday");
		} else if (day == 5) {
			System.out.println("friday");
		} else if (day == 6) {
			System.out.println("saturday");
		} else {
			System.out.println("inv-alid");
		}
	}
}
