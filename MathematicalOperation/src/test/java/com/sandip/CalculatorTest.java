package com.sandip;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	@Before
	public void setUp() {

	}

	@Test
	public void addTest() {
		assertTrue("Sum:-", Calculator.add(5, 5) == 10);
	}

	@Test
	public void substractTest() {
		assertTrue("Substract:-", Calculator.substract(5, 5) == 0);
	}

	@Test
	public void multiplyTest() {
		assertTrue("Multiply:-", Calculator.multiply(5, 5) == 25);
	}

	@Test
	public void divideTest() {
		// Below tow lines test the both if and else block of Claculator.divide() method
		// You can comment one line of the code and will see there is a change in coverage report
		assertTrue("Divide by non zero:-", Calculator.divide(5, 5) == 1);
		assertTrue("Divide by zero:-", Calculator.divide(5, 0) == -1);
	}
}