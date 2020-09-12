package learning_java.servicios;

import java.util.Arrays;

public class RamdomColorsPack {
	
	public static String ColorsArray(int n) {
		String[] RamdomColorsPack = new String[n];
		for (int i = 0; i < RamdomColorsPack.length; i++) {
			RamdomColorsPack[i] = RandomColorGenerator.randomColor();
		}
	return Arrays.toString(RamdomColorsPack);
	}
}
