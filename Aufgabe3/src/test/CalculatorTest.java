package htwg_konstanz.swqs.ro981rin.aufgabe3;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class CalculatorTest {
	Calculator calc;
	
	@Before
	public void setup() {
		calc = new Calculator();
	}
	
	@Test
	public void test() {

		assertTrue(calc.addition(1, 1) == 2);
		assertTrue(calc.addition(1, 0) == 1);
		assertTrue(calc.addition(0, 0) == 0);
		assertTrue(calc.addition(0, -1) == -1);
		assertTrue(calc.addition(-1, -1) == -2);
		
		assertTrue(calc.substraction(1, 1) == 0);
		assertTrue(calc.substraction(1, 0) == 1);
		assertTrue(calc.substraction(0, 0) == 0);
		assertTrue(calc.substraction(0, -1) == 1);
		assertTrue(calc.substraction(-1, -1) == 0);

		assertTrue(calc.division(1, 1) == 1);
		assertTrue(calc.division(10, 2) == 5);
		assertTrue(calc.division(10, -1) == -10);
		assertTrue(Double.isInfinite(calc.division(1, 0)));
		assertTrue(Double.isNaN(calc.division(0, 0)));
		assertTrue(calc.division(0, 1) == 0);
		assertTrue(calc.division(14, 8) == 1.75);
		
		assertTrue(calc.multiplication(1, 1) == 1);
		assertTrue(calc.multiplication(5, 2) == 10);
		assertTrue(calc.multiplication(10, 0) == 0);
		assertTrue(calc.multiplication(0, 10) == 0);
		assertTrue(calc.multiplication(0, 0) == 0);
		assertTrue(calc.multiplication(-10, 2) == -20);
		assertTrue(calc.multiplication(-2, -3) == 6);
	}
	
	@After
	public void tearDown() {
		calc = null;
	}

}