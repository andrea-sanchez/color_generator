package learning_java;

import learning_java.servicios.ColorsCodes;

public class Main {
	public static void main(String[] args) {
		int n = 6;
		String colorsCodesList = new String();
		colorsCodesList = ColorsCodes.ColorsLists(n);
		System.out.println(colorsCodesList);
	}
}
