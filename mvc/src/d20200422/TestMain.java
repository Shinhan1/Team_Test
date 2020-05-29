package d20200422;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd a hh:mm");		// a -> 오전/오후
		
		String now = sdf.format(d);
		
		System.out.println(now);
		
	}

}
