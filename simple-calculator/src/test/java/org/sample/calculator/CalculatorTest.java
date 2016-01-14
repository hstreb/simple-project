package org.sample.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	public void addOneAndOneEqualsTwo() {
		assertTrue(calculator.add(1, 1) == 2);
	}

	@Test
	public void subOneAndOneEqualsZero() {
		assertTrue(calculator.sub(1, 1) == 0);
	}

}
