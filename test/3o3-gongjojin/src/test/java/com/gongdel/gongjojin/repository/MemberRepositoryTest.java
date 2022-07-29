package com.gongdel.gongjojin.repository;

import com.gongdel.gongjojin.entity.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

	@Autowired
	MemberRepository target;

	@Test
	void testMember() {
		// Given
		Member member = new Member("gongjojin");
		Member savedMember = target.save(member);

		// When
		Member findMember = target.findById(savedMember.getId()).get();

		// Then
		Assertions.assertThat(findMember).isEqualTo(member);
	}
}