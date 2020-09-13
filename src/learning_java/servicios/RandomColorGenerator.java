package learning_java.servicios;

import java.util.Random;

public class RandomColorGenerator{	
	public static String randomColor() {
		Random color = new Random();
		// Creates a random number. The maximum is ffffff (hex) = 16777215 (dec)
		int randomNumber = color.nextInt(0xffffff + 1);
		String colorCode = String.format("#%06x", randomNumber);
		return colorCode.toString();
	}
}
