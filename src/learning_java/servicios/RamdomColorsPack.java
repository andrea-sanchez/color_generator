package learning_java.servicios;

import java.util.Arrays;

public class RamdomColorsPack {
	
	public static String ColorsArray(int n) {
		String[] randomColorsArray = new String[n];
		for (int i = 0; i < randomColorsArray.length; i++) {
			randomColorsArray[i] = RandomColorGenerator.randomColor();
		}
		return Arrays.toString(randomColorsArray);
	}
}
