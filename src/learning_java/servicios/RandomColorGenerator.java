package learning_java.servicios;

import java.util.Random;

public class RandomColorGenerator{	
	public static String randomColorHex() {
		Random random = new Random();
		// Creates a random number. The maximum is ffffff (hex) = 16777215 (dec)
		// The upper bound for nextInt() is exclusive so we must add + 1
		int randomNumberInt = random.nextInt(0xffffff + 1);
		String randomNumberHex = String.format("#%06x", randomNumberInt);
		return randomNumberHex.toString();
	}
}
