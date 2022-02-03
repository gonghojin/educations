package chap6;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class OrderLine {

	private long id;
	private OrderLineType type;
	private long productId;
	private int quantity;
	private BigDecimal amount;

	@Builder
	public OrderLine(long id, OrderLineType type, long productId, int quantity, BigDecimal amount) {
		this.id = id;
		this.type = type;
		this.productId = productId;
		this.quantity = quantity;
		this.amount = amount;
	}

	enum OrderLineType {
		PURCHASE,
		DISCOUNT
	}
}
