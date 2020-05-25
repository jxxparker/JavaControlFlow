package Sum3and5Challenge;

public class Sum3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if((i % 3 == 0) && (i % 5 ==0)) {
				count++;
				sum += i;
				System.out.println();
				System.out.println("found number = " + i);
			}
			if(count == 5) {
				break;
			}
		}
		System.out.println("sum = " + sum);
	}

}
