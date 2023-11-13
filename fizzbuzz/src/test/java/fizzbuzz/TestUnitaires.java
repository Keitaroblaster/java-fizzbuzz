package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;



public class TestUnitaires {

	@Test
	public void testFizz() {
		assertEquals("FIZZ", Fizzbuzz.check(12));		
	}
	
	@Test
	public void testBuzz() {		
		assertEquals("BUZZ", Fizzbuzz.check(10));	
	}
	
	@Test
	public void testFizzBuzz() {		
		assertEquals("FIZZBUZZ", Fizzbuzz.check(15));		
	}
}
