package com.apple.shop.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

// 회원 저장용 테이블
@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String displayName;
    private String password;
}
