package learning_java;

import learning_java.servicios.RamdomColorsPack;

public class Main {
	public static void main(String[] args) {
		String randomColorsArray = new String();
		randomColorsArray = RamdomColorsPack.colorsArray(6);
		System.out.println(randomColorsArray);
	}
}
