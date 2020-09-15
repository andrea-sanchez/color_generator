package dev.kodice.hexcolorgenerator.services;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RandomColorsPackTest {

	@InjectMocks
	private RandomColorsPack colorPack;

	@Mock
	private RandomColorGenerator randomColorGenerator;

	@Test
	public void testColorsArray() {
		Mockito.when(randomColorGenerator.randomColorHex(ArgumentMatchers.<Random>any())).thenReturn("#ffffff");
		var colors = colorPack.colorsArray(5, 6);
		Mockito.verify(randomColorGenerator, Mockito.times(5)).randomColorHex(ArgumentMatchers.<Random>any());
		assertTrue(colors.size() == 5);
		assertTrue(colors.get(0).equals("#ffffff"));
	}

}
