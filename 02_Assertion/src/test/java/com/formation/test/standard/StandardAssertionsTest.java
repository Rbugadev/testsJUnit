package com.formation.test.standard;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StandardAssertionsTest {
	
	@Test
	void standardAssertions() {
		assertEquals(2,2);
		assertNotEquals(2,3);
		
		assertTrue(true, "Un premier message");
		assertFalse(false, () -> "Un autre message.");
	}

}
