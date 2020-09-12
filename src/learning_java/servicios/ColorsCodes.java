package learning_java.servicios;

import java.util.Arrays;

public class ColorsCodes {
	
	public static String ColorsLists(int n) {
		String[] colorsCodes = new String[n];
		for (int i = 0; i < colorsCodes.length; i++) {
			colorsCodes[i] = RandomColorGenerator.randomColor();
		}
	return Arrays.toString(colorsCodes);
	}
}
