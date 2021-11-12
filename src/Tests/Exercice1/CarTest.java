package Exercice1;

import static org.junit.Assume.assumeNoException;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {
	@Test
	public void testValNegative() {
		Assertions.assertNotNull(IllegalArgumentException.class);
		Car c = new Car("BMW", -200000);
	}
	//test Except brand null

}
