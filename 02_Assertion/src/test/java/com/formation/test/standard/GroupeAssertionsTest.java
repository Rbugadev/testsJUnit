package com.formation.test.standard;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.formation.Address;

public class GroupeAssertionsTest {
	
	@Test
	void groupeAssertions() {
		Address address = new Address("Momadi", "Nassur");
		
		assertAll("address", () -> assertEquals("Momadi", address.getFirstName()), () -> assertEquals("Nassur", address.getLastName()));
	}
}
