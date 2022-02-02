package chap3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriFunctionTest {

	@Test
	void addTreeNumbers() {
		TriFunction<Integer, Integer, Integer, Integer> addTreeNumbers
				= (x, y, z) -> x + y + z;
		Integer result = addTreeNumbers.apply(3, 2, 5);

		Assertions.assertEquals(10, result);

	}
}