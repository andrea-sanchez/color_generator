package dev.kodice.hexcolorgenerator.services;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomColorGenerator {

	public String randomColorHex(int seed) {
		Random random = new Random();
		random.setSeed(seed);
		// Creates a random number. The maximum is ffffff (hex) = 16777215 (dec)
		// The upper bound for nextInt() is exclusive so we must add + 1
		int randomNumberInt = random.nextInt(0xffffff + 1);
		String randomNumberHex = String.format("#%06x", randomNumberInt);
		return randomNumberHex.toString();
	}

}
