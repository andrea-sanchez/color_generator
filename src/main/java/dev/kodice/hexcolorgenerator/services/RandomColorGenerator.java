package dev.kodice.hexcolorgenerator.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomColorGenerator {

	public String randomColorHex() {
		return this.randomColorHex(null);
	}

	public String randomColorHex(Random random) {
		var r = Optional.ofNullable(random).orElse(new Random());
		// Creates a random number. The maximum is ffffff (hex) = 16777215 (dec)
		// The upper bound for nextInt() is exclusive so we must add + 1
		var randomNumberInt = r.nextInt(0xffffff + 1);
		var randomNumberHex = String.format("#%06x", randomNumberInt);
		return randomNumberHex;
	}

}
