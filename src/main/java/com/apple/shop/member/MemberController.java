package com.apple.shop.member;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Getter
@Setter
@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;// <- new BCryptPasswordEncoder() 남음
    private final MemberService memberService;

    @GetMapping("/register") // GET: 리소스 조회 메서드 (Read)
    String register() {
        return "register.html";
    }
    @PostMapping("/member") // POST: 전달한 데이터 처리/생성 요청 메서드 (Create)
    String addMember(String  username,
                     String password,
                     String displayName) throws Exception { // 2. 전송누르면 서버로 보내서 서버는 그걸 DB에 저장
        memberService.saveMember(username, password, displayName);//유저가 보낸 아이디 비번 이름 디비에 저장
        return "redirect:/list";
    }
    // 1. 로그인 페이지 만들기 -> 2. 나는 폼으로 로그인하겟따 시큐리티콘피크 이동ㄱㄱ -> 3. DB에 있던 유저 정보 꺼내는 코드
    @GetMapping("/login")
    public String login() {
        var result = memberRepository.findByUsername("안재혁");
        System.out.println(result.get().getDisplayName());
        return "login.html";
    }
}
