package com.entornos.alvaroMeridaViedma.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testAlgoritmos {

	static algoritmos a;
	
	@BeforeAll
	static void setup() {
		a = new algoritmos() {};
	}
	
	@Test
	void testFibonacciNegativo() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					a.fibonacci(-1);
				});	
	}
	
	@Test
	void testPrimosNegativo() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					a.primo(-1);
				});
	}
	
	@Test
	void testFactorialNegativo() {
		assertThrows(IllegalArgumentException.class,
				() -> {
					a.factorial(-1);
				});
	}
	
	
	@Test
	void testFibonacci() {
		assertEquals(3, a.fibonacci(4));
		assertEquals(8, a.fibonacci(6));
		assertEquals(13, a.fibonacci(7));
		
	}
	
	@Test
	void testPrimos() {
		assertEquals(true, a.primo(7));
		assertEquals(true, a.primo(5));
		assertEquals(false, a.primo(12));
	}
	
	@Test
	void testFactorial() {
		assertEquals(120, a.factorial(5));
		assertEquals(24, a.factorial(4));
		assertEquals(5040, a.factorial(7));
	}
}