package com.apple.shop.member;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
Optional<Member> findByUsername(String username); // 함수 만들기 -> Derived query methods
}
