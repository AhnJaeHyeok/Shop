package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// API란 Application Programming Interface의 약자로,
// 어떤 서버의 특정한 부분에 접속해서 그 안에 있는 데이터와 서비스를 이용할 수 있게 해주는 소프트웨어 도구이다.

// 템플릿엔진: 그때 그때 새로 만들어주는 라이브러리 임
// 서버/Database의 데이터를 HTML에 집어넣을 수 있음 -> 템플릿엔진 쓰면 가능

// list 페이지로 접속하면 상품페이지 보여주자

@Controller //여기에 api 를 만들수 있음
public class ItemController {

    @GetMapping("/list")
    // HTML에 서버데이터 넣으려면 -> 파라미터에 Model model -> model.addAttribute(작명,데이터) -> HTML파일에선 th:text="${작명}"
    String list(Model model){
        model.addAttribute("name","홍길동");
        return"list.html";
    }
}
