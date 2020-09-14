package dev.kodice.hexcolorgenerator.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.kodice.hexcolorgenerator.services.RandomColorsPack;

@RestController
public class HexColorGeneratorController {
	
	@Autowired
	private RandomColorsPack randomColorsPack;
	
	@RequestMapping("/{userSeed}/{nColors}")
	public List<String> hexColorGenetarot(@PathVariable int userSeed, @PathVariable int nColors) {
		return this.randomColorsPack.colorsArray(nColors, userSeed);
	}

}
