package dev.kodice.hexcolorgenerator.models.dto;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static com.google.code.beanmatchers.BeanMatchers.registerValueGenerator;

import org.junit.Test;

public class RandomColorsResponseTest {

	@Test
	public void testRandomColorsResponse() {
		registerValueGenerator(() -> {
			double m = (Math.random() * (12)) + 1;
			double d = (Math.random() * (25)) + 1;
			return LocalDateTime.of(2019, (int) m, (int) d, (int) d, (int) m);	
		}, LocalDateTime.class);
		
		assertNotNull(new RandomColorsResponse(null, 5));
		assertThat(RandomColorsResponse.class, hasValidBeanConstructor());
		assertThat(RandomColorsResponse.class, hasValidBeanToString());
		assertThat(RandomColorsResponse.class, hasValidGettersAndSetters());
	}

}
