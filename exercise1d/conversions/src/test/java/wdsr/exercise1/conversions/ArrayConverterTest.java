package wdsr.exercise1.conversions;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class ArrayConverterTest {
	
	private ArrayConverter arrayConverter;

	@Before
	public void setup() {
		arrayConverter = new ArrayConverter();
		
	}

	@Test(expected = NullPointerException.class)
	public void shouldThrowExceptionWhenVluesAreNull() {
		// given
		String[] values = null;

		// when
		arrayConverter.convertToInts(values);

		// then
		// empty
	}
	
	@Test(expected = NumberFormatException.class)
	public void shouldThrowExceptionWhenValueNotInt() {
		// given
		String[] values = {"1","2","ble"};

		// when
		arrayConverter.convertToInts(values);

		// then
		// empty
	}
	
	@Test
	public void shouldReturnIntArray() {
		// given
		String[] values = {"1","2","3"};

		int[] expected = {1,2,3};
		// when
		int[] result= arrayConverter.convertToInts(values);

		// then
		assertArrayEquals(expected,result);
	}
	

}
