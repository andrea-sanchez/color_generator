package dev.kodice.hexcolorgenerator.models.dto;

import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanConstructor;
import static com.google.code.beanmatchers.BeanMatchers.hasValidBeanToString;
import static com.google.code.beanmatchers.BeanMatchers.hasValidGettersAndSetters;
import static com.google.code.beanmatchers.BeanMatchers.registerValueGenerator;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.Test;

class RandomColorsResponseTest {

	@Test
	public void testRandomColorsResponse() {
		registerValueGenerator(() -> {
			int month = ThreadLocalRandom.current().nextInt(1, 13);
			int day = ThreadLocalRandom.current().nextInt(1, 28);
			int hour = ThreadLocalRandom.current().nextInt(0, 13);
			int minutes = ThreadLocalRandom.current().nextInt(0, 60);
			return LocalDateTime.of(2019, month, day, hour, minutes);
		}, LocalDateTime.class);
		assertNotNull(new RandomColorsResponse(null, 5));
		assertThat(RandomColorsResponse.class, hasValidBeanConstructor());
		assertThat(RandomColorsResponse.class, hasValidBeanToString());
		assertThat(RandomColorsResponse.class, hasValidGettersAndSetters());
	}

}
