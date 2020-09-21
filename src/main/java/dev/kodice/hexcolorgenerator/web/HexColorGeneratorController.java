package dev.kodice.hexcolorgenerator.web;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.kodice.hexcolorgenerator.models.dto.RandomColorsResponse;
import dev.kodice.hexcolorgenerator.services.RandomColorsPack;

@RestController
@RequestMapping(path = "/random")
public class HexColorGeneratorController {

	@Autowired
	private RandomColorsPack randomColorsPack;

	@GetMapping
	public RandomColorsResponse defaultHexColor(@RequestParam(defaultValue = "1") int nColors,
			@RequestParam(required = false) Optional<Integer> seed) {
		var maxRandomSeed = 1001;
		var finalSeed = seed.orElseGet(() -> new Random().nextInt(maxRandomSeed));
		List<String> colors = this.randomColorsPack.colorsArray(nColors, finalSeed);
		var response = new RandomColorsResponse(colors, finalSeed);
		return response;
	}

}
