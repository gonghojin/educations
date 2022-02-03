package chap6;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@EqualsAndHashCode
@ToString
public class User {

	private int id;
	private String name;
	private String emailAddress;
	private boolean isVerified;
	private List<Integer> friendUserId;

	@Builder
	public User(int id, String name, String emailAddress, boolean isVerified, List<Integer> friendUserId) {
		this.id = id;
		this.name = name;
		this.emailAddress = emailAddress;
		this.isVerified = isVerified;
		this.friendUserId = friendUserId;
	}
}
