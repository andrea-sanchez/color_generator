package learning_java;

import learning_java.servicios.RamdomColorsPack;

public class Main {
	public static void main(String[] args) {
		String colorsCodesList = new String();
		colorsCodesList = RamdomColorsPack.ColorsArray(6);
		System.out.println(colorsCodesList);
	}
}
