package CurrentTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println(currentDate);
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("MM/dd/yy");
		System.out.println(timeFormat.format(currentDate));

	}

}
