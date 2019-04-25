package com.formation.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifecycleJUnit5Test {
	
	@BeforeAll
	static void setupAll() {
		System.out.println("BeforeAll");
	}
	
	@BeforeEach
	void setup() {
		System.out.println("BeforeEach");
	}
	
	@Test
	void testOne() {
		System.out.println("TEST 1");
	}
	
	@Test
	void testTwo() {
		System.out.println("TEST 2");
	}
	
	@AfterEach
	void teardown() {
		System.out.println("AfterEach");
	}
	
	@AfterAll
	static void teardownAll() {
		System.out.println("AfterAll");
	}

}
