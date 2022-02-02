package chap4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class UserTest {

	@Test
	void sort() {
		List<User> users = Arrays.asList(
				new User(3, "Alice"),
				new User(1, "Charlie"),
				new User(5, "Bob")
		);

		Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
		Collections.sort(users, idComparator);
		System.out.println(users);

		Comparator<User> nameComparator = (u1, u2) -> u2.getName().compareTo(u1.getName());
		Collections.sort(users, nameComparator);
		System.out.println(users);

	}
}