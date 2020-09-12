package learning_java;

import learning_java.servicios.GeneratorColor;

public class Main {

	public static void main(String[] args) {
		int n = 6;
		String[] colorsCodes = new String[n];
		
		for (int i = 0; i < n; i++) {
			colorsCodes[i] = GeneratorColor.randomColor();
			System.out.println(colorsCodes[i]);
		}
	}
}
