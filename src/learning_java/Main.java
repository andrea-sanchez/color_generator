package learning_java;

import learning_java.servicios.GeneratorColor;

public class Main {

	public static void main(String[] args) {
		String colorsList = GeneratorColor.randomColor();
		System.out.println(colorsList);
	}
}
