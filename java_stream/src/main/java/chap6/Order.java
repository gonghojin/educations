package chap6;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class Order {

	private long id;
	private LocalDateTime createdAt;
	private long createdByUserId;
	private OrderStatus status;
	private BigDecimal amount;
	private List<OrderLine> orderLines;

	@Builder
	public Order(long id, LocalDateTime createdAt, long createdByUserId, OrderStatus status, BigDecimal amount,
				 List<OrderLine> orderLines) {
		this.id = id;
		this.createdAt = createdAt;
		this.createdByUserId = createdByUserId;
		this.status = status;
		this.amount = amount;
		this.orderLines = orderLines;
	}

	enum OrderStatus {
		CREATED,
		IN_PROGRESS,
		ERROR,
		PROCESSED
	}
}
