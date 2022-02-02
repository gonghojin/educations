package chap3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

class AdderTest {

	@Test
	void apply() {
		Function<Integer, Integer> myAdder = (x) -> x + 10;
		Integer apply = myAdder.apply(5);

		Assertions.assertEquals(15, apply);
		Assertions.assertNotEquals(100, apply);
	}
}