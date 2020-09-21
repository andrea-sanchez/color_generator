package dev.kodice.hexcolorgenerator.models.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class RandomColorsResponse {

	private List<String> colors;

	private LocalDateTime time;

	private int seed;

	public RandomColorsResponse() {
		this.colors = new ArrayList<String>();
		this.seed = -1;
		this.time = LocalDateTime.now();
	}

	public RandomColorsResponse(List<String> colors, int seed) {
		this.colors = colors;
		this.seed = seed;
		this.time = LocalDateTime.now();
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

	@Override
	public String toString() {
		return "RandomColorsResponse [colors=" + colors + ", time=" + time + ", seed=" + seed + "]";
	}

}
