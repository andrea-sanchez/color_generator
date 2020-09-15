package dev.kodice.hexcolorgenerator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomColorsPack {

	@Autowired
	private RandomColorGenerator randomColorGenerator;

	public List<String> colorsArray(int nColor, int userSeed) {
		var colorsHex = new ArrayList<String>();
		var random = new Random();
		random.setSeed(userSeed);
		for (var iColor = 0; iColor < nColor; iColor++) {
			colorsHex.add(this.randomColorGenerator.randomColorHex(random));
		}
		return colorsHex;
	}

}
