package ForLoop;

public class Nested {

	public static void main(String[] args) {
		for(int i = 0; i < 4; i++) {
			System.out.println("its cold outside");
		}
		System.out.println("---------------------");
		String[] colors = {"Red", "blue", "green"};
		 
		for(int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		
		String[][] fancycolors = { {"red", "blue", "green"},
									{"yellow","orange", "purple"} };
		
		for(int i = 0; i < 2;i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(fancycolors[i][j]);
			}
		}
		
 	}

}
