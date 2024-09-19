package com.apple.shop.member;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveMember(String username, String password, String displayName) throws Exception {
        if (username.length() < 8 || password.length() < 8){
            throw new Exception("너무짧음");
        }
            Member member = new Member();
            member.setUsername(username);
            var hash = passwordEncoder.encode(password);
            member.setPassword(hash);
            member.setDisplayName(displayName);
            this.memberRepository.save(member);//유저가 보낸 아이디 비번 이름 디비에 저장
    }
}
