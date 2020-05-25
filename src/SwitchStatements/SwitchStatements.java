package SwitchStatements;

public class SwitchStatements {

	public static void main(String[] args) {
//		int value = 3;
//		if (value == 1) {
//			System.out.println("value was 1.");
//		} else if (value == 2) {
//			System.out.println("value was 2.");
//		} else {
//			System.out.println("not 1 or 2.");
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
				System.out.println("value was 3,4,5");
				System.out.println("actually it was a " + switchValue);
				break;
				
			default:
				System.out.println("not 1 or two");
				break;
		}
		char charValue = 'C';
		switch(charValue) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C': case 'D': case 'E':
			System.out.println("c,d, or e was found");
			break;
		default:
			System.out.println("not a,b,c,d,e");
			
		}
		String month = "JANUARY";
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("jan");
			break;
		case "june":
			System.out.println("jun");
			break;
		default:
			System.out.println("????");
		}
		
	}

}
