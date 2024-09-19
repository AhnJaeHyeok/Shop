//package com.apple.shop.member;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//// SpringSecurity가 유저가 제출한 비번 == DB에 있던 비번 -> 자동으로 해줌
//// 근데 DB에 있던 비번은 시큐리티가 모르기때문에 코드를 짜줘야함 여기가 그곳임
//// 3. DB에 있던 유저 정보 꺼내는 코드
//           //    이 클래스가  ⬇️    implements  이 interface⬇️ 따라하나 검사 해주세요
//@Service
//@RequiredArgsConstructor
//public class MyUserDetailsService implements UserDetailsService {
//
//    private final MemberRepository memberRepository;
//
//    @Override        //유저가 제출한 username 이 들어있음⬇️
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        //  DB에서 username을 가진 유저를 찾아와서
//        //  return new User(유저아이디, 비번, 권한) 해주세요
//        //DB에서 username 들어있는 행 찾기
//
//        memberRepository.findByUsername(username); // 유저가 제출한 아이디(username) 찾기
//
//    }
//}
