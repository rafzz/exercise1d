package wdsr.exercise1.logic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;
	CustomMatcher customMatcher;

	@Before
	public void setup() {
		calculator = new Calculator();
	}

	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };

		// when
		int min = calculator.min(values);

		// then
		assertEquals(values[0], min);
	}

	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given
		int[] values = { 2, -3, 5 };

		// when
		int min = calculator.min(values);

		// then
		assertEquals(-3, min);
	}

	

	@Test(expected = IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;

		// when
		calculator.min(values);

		// then
		// empty
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given
		int[] values = {};

		// when
		calculator.min(values);

		// then
		// empty
	}
	@Test
	public void testMax_shouldReturnTheMaxFromNegativeValues() {
		// given
		int[] values = { -3, -2, -5 };

		// when
		// empty

		// then
		assertThat(-2, customMatcher.matches(calculator.max(values)));
	}
	@Test
	public void testMax_shouldReturnTheMaxFromPositiveValues() {
		// given
		int[] values = { 1, 5, 3 };

		// when
		// empty

		// then
		assertThat(5, customMatcher.matches(calculator.max(values)));
	}
	@Test
	public void testMax_shouldReturnOneValue() {
		// given
		int[] values = { 4 };

		// when
		

		// then
		assertThat(values[0], customMatcher.matches(calculator.max(values)));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testMax_shouldThrowExceptionWhenVluesAreNull() {
		// given
		int[] values = null;

		// when
		calculator.max(values);

		// then
		// empty
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMax_shouldThrowExceptionWhenArgumentsEmpty() {
		// given
		int[] values = {};

		// when
		calculator.max(values);

		// then
		// empty
	}
}
