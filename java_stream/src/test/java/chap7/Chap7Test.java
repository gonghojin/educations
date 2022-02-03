package chap7;

import chap6.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Chap7Test {

	@Test
	void optional_default() {
		Optional<User> maybeGetUser = Optional.of(maybeGetUser(true));
		maybeGetUser.ifPresent(System.out::println);

		Optional<Integer> maybeId = maybeGetUser.map(User::getId);
		maybeId.ifPresent(System.out::println);
	}

	User maybeGetUser(boolean returnUser) {
		if (returnUser) {
			return User.builder()
					.id(1)
					.name("gongdel")
					.emailAddress("gongdel@gmail.com")
					.isVerified(true)
					.build();
		}
		return null;
	}
}
