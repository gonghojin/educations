package chap3;

import java.util.function.Function;

public class Adder implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer integer) {
		return 10 + integer;
	}
}
