package learning_java.servicios;

import java.util.Arrays;

public class RamdomColorsPack {
	
	public static String colorsArray(int n) {
		String[] colorsHex = new String[n];
		for (int i = 0; i < colorsHex.length; i++) {
			colorsHex[i] = RandomColorGenerator.randomColorHex();
		}
		return Arrays.toString(colorsHex);
	}
}
