package dev.kodice.hexcolorgenerator.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import dev.kodice.hexcolorgenerator.models.dto.RandomColorsResponse;
import dev.kodice.hexcolorgenerator.services.RandomColorsPack;

@RestController
public class HexColorGeneratorController {
	
	@Autowired
	private RandomColorsPack randomColorsPack;
	
	@GetMapping("/{nColors}")
	public RandomColorsResponse hexColorGenetarot(@PathVariable int nColors) {
		List<String> colors = this.randomColorsPack.colorsArray(nColors);
		return new RandomColorsResponse(colors); 
	}

}
