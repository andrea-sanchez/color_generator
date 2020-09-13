package dev.kodice.hexcolorgenerator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomColorsPack {

	@Autowired
	private RandomColorGenerator randomColorGenerator;

	public List<String> colorsArray(int n) {
		List<String> colorsHex = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			colorsHex.add(this.randomColorGenerator.randomColorHex());
		}
		return colorsHex;
	}
}
