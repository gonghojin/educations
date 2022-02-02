package chap4;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chap4Test {

	@Test
	void supplier() {
		Supplier<Double> randomFunc = () -> Math.random();
		printRandomDouble(randomFunc, 3);
	}

	public void printRandomDouble(Supplier<Double> randomSupplier, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(randomSupplier.get());
		}
	}

	@Test
	void consumer() {
		List<Integer> integerList = Arrays.asList(4, 2, 3);
		Consumer<Integer> processor = x -> System.out.println("Processing Integer : " + x);
		process(integerList, processor);
	}

	<T> void process(List<T> inputs, Consumer<T> processor) {
		for (T input : inputs) {
			processor.accept(input);
		}
	}

	@Test
	void predicate() {
		Predicate<Integer> isPositive = x -> x > 0;
		Assertions.assertTrue(isPositive.test(5));
		Assertions.assertFalse(isPositive.test(-5));

		List<Integer> inputs = Arrays.asList(10, -5, 4, -2, 0);
		List<Integer> result = predicate_filter(inputs, isPositive);
		Assertions.assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(10, 4), result));

		List<Integer> negative_result = predicate_filter(inputs, isPositive.negate());
		Assertions.assertTrue(CollectionUtils.isEqualCollection(Arrays.asList(-5, -2, 0), negative_result));

	}

	<T> List<T> predicate_filter(List<T> inputs, Predicate<T> condition) {
		List<T> output = new ArrayList<>();
		for (T input : inputs) {
			if (condition.test(input)) {
				output.add(input);
			}
		}
		return output;
	}
}
