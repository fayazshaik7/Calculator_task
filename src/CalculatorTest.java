import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test_addition() {
		//fail("Not yet implemented");
		Calculator CalculatorObject = new Calculator();
		assertEquals(12.1,CalculatorObject.addition(10,2.1));
	}
	
	@Test
	void test_multiplication() {
		//fail("Not yet implemented");
		Calculator CalculatorObject = new Calculator();
		assertEquals(20,CalculatorObject.multiplication(10,2));
		
	}
	
	@Test
	void test_division() {
		//fail("Not yet implemented");
		Calculator CalculatorObject = new Calculator();
		assertEquals(5,CalculatorObject.division(10,2));
	}

}