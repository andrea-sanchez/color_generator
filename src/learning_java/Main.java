package learning_java;

import java.util.Arrays;

import learning_java.servicios.GeneratorColor;

public class Main {

	public static void main(String[] args) {
		
		int n = 6;
		String[] colorsCodes = new String[n];
		
		for (int i = 0; i < colorsCodes.length; i++) {
			colorsCodes[i] = GeneratorColor.randomColor();
		}
		
		System.out.println(Arrays.toString(colorsCodes));
	}
}
