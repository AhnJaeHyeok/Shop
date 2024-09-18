package com.apple.shop;

import org.springframework.data.jpa.repository.JpaRepository;
// Item 테이블의 데이터 꺼내기
public interface ItemRepository extends JpaRepository<Item, Long> { // 1. Repository 만들기
}
