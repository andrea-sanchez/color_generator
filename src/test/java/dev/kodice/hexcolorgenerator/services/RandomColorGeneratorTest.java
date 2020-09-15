package dev.kodice.hexcolorgenerator.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RandomColorGeneratorTest {

	@Test
	public void testValidHexColor() {
		var coloreGenerator = new RandomColorGenerator();
		var color = coloreGenerator.randomColorHex();
		assertTrue(color.charAt(0) == '#');
		assertTrue(color.length() == 7);
		assertTrue(Integer.parseInt(color.substring(1), 16) < 0xffffff);
	}

}
