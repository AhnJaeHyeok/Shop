package com.apple.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    //누가 만들어놓은 클래스를 DI 로 쓰고싶다면

    @Bean
    PasswordEncoder passwordEncoder(){ // 이제 아무데서나 등록해서 사용가능
        return new BCryptPasswordEncoder(); // <- 스프링이 가져가서 Bean 으로 만들어줌
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf((csrf) -> csrf.disable());
        http.authorizeHttpRequests((authorize) ->
                authorize.requestMatchers("/**").permitAll()
        ); //2. 나는 폼으로 로그인 하겠다..
                http.formLogin((formLogin)
                        -> formLogin.loginPage("/login") // 로그인 페이지 URL 적기
                        .defaultSuccessUrl("/")
                        // 로그인 성공시 URL
// .failureUrl("/") // 로그인 실패시 URL  // 실패시 기본적으로 login?error 띄어줌
                );
        return http.build();
    }
}
