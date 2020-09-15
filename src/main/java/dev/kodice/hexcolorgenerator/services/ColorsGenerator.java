package dev.kodice.hexcolorgenerator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ColorsGenerator {

	@Autowired
	private RandomColorGenerator randomColorGenerator;

	public List<String> getRandomPalette(int n, int userSeed) {
		List<String> colorsHex = new ArrayList<String>();
		Random random = new Random();
		random.setSeed(userSeed);
		for (int i = 0; i < n; i++) {
			colorsHex.add(this.randomColorGenerator.getColor(Optional.of(random)));
		}
		return colorsHex;
	}

}
