package chap6;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter6Test {

	@Test
	void stream_flatMat() {
		String[][] cities = new String[][]{
				{"Seoul", "Busan"},
				{"San Francisco", "New York"},
				{"Madrid", "Barcelona"}
		};

		Stream<String[]> stream = Arrays.stream(cities);
		Stream<String> stringStream = stream.flatMap(Arrays::stream);
		List<String> collect = stringStream.collect(Collectors.toList());
		System.out.println(collect);
	}

	@Test
	void stream_flatMat_응용() {
		Order order1 = Order.builder()
				.id(1)
				.orderLines(Arrays.asList(
						OrderLine.builder()
								.id(10)
								.type(OrderLine.OrderLineType.DISCOUNT)
								.amount(BigDecimal.valueOf(1000))
								.build()))
				.build();
		Order order2 = Order.builder()
				.id(2)
				.orderLines(Arrays.asList(
						OrderLine.builder()
								.id(20)
								.type(OrderLine.OrderLineType.DISCOUNT)
								.amount(BigDecimal.valueOf(2000))
								.build()))
				.build();
		Order order3 = Order.builder()
				.id(3)
				.orderLines(Arrays.asList(
						OrderLine.builder()
								.id(30)
								.type(OrderLine.OrderLineType.DISCOUNT)
								.amount(BigDecimal.valueOf(3000))
								.build()))
				.build();

		List<Order> orders = Arrays.asList(order1, order2, order3);
		List<OrderLine> collect = orders.stream()
				.map(Order::getOrderLines)
				.flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println(collect);
	}
}
