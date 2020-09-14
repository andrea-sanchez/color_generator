package models.dto;

import java.time.LocalDateTime;
import java.util.List;

public class RandomColorsResponse {
	
	private List<String> colors;

	private LocalDateTime time;

	private int nColors;
	
	private int seed;
	

	public RandomColorsResponse(List<String> colors, int seed) {
		this.colors = colors;
		this.seed = seed;
		this.nColors = colors.size();
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

	public int getnColors() {
		return nColors;
	}

	public void setnColors(int nColors) {
		this.nColors = nColors;
	}
	
	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

}
