package com.apple.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
        // @ResponseBody = 문자 그대로 보내주세요 라는 어노테이션
        // 그래서 html 파일을 보낼때는 빼줘야함
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "왜 왔니?";
    }

    @GetMapping("/myPage")
    @ResponseBody
    String myPage() {
        return "어서와 나야~";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
        return ZonedDateTime.now().toString();
    }
}
