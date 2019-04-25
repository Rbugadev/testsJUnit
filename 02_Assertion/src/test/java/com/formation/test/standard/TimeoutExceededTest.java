package com.formation.test.standard;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import org.junit.jupiter.api.Test;

public class TimeoutExceededTest {
	
	@Test
	void timeoutNotExceeded() {
		assertTimeout(ofMinutes(2), () -> {
			
		});
	}
	
	@Test
	void timeoutExceeded() {
		assertTimeout(ofMillis(10), () -> {
			Thread.sleep(100);
		});
	}
}
