package chap8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Chap8Test {

	@Test
	void stream_advanced() {
		List<Integer> numbers = Arrays.asList(3, 4, 2, 7, 9);
		boolean allPositive = numbers.stream()
				.allMatch((value) -> value > 0);
		Assertions.assertTrue(allPositive);

		List<Integer> numbers2 = Arrays.asList(-3, 4, 2, 7, 9);
		boolean allMatch2 = numbers2.stream().allMatch(value -> value > 0);
		Assertions.assertFalse(allMatch2);
		boolean anyMatch = numbers2.stream().anyMatch(value -> value > 0);
		Assertions.assertTrue(anyMatch);
	}
}
