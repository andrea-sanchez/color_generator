package learning_java.servicios;

import java.util.Random;

public class RandomColorGenerator{	
	public static String randomColor() {
		Random obj = new Random();
		int randomNum = obj.nextInt(0xffffff + 1);
		String colorCode = String.format("#%06x", randomNum);
		return colorCode.toString();
	}
}
