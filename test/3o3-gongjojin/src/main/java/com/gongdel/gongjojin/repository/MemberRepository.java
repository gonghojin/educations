package com.gongdel.gongjojin.repository;

import com.gongdel.gongjojin.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
