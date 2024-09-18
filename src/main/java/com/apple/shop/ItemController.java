package com.apple.shop;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// API란 Application Programming Interface의 약자로,
// 어떤 서버의 특정한 부분에 접속해서 그 안에 있는 데이터와 서비스를 이용할 수 있게 해주는 소프트웨어 도구이다.

// 템플릿엔진: 그때 그때 새로 만들어주는 라이브러리 임
// 서버/Database의 데이터를 HTML에 집어넣을 수 있음 -> 템플릿엔진 쓰면 가능

// list 페이지로 접속하면 상품페이지 보여주자

// ************ Controller 는 보통 데이터나 html 보내는 파일 ************

@Controller // 여기에 api 를 만들수 있음
@RequiredArgsConstructor // 해당 필드로 구성된 생성자를 @RequiredArgsConstructor가 자동으로 생성자 주입에 대한 코드를 생성.
public class ItemController {

    private final ItemRepository itemRepository; // 2. 원하는 클래스에 repository 등록

    @GetMapping("/list")
// HTML에 서버데이터 넣으려면 -> 파라미터에 Model model -> model.addAttribute(작명,데이터) -> HTML파일에선 th:text="${작명}"
    String list(Model model) {// Item 테이블의 데이터 꺼내기
        List<Item> result = itemRepository.findAll(); // findAll() -> 테이블의 모든 데이터를 가져옴
        model.addAttribute("items", result);

        return "list.html";
    }

    @GetMapping("/write")
// HTML에 서버데이터 넣으려면 -> 파라미터에 Model model -> model.addAttribute(작명,데이터) -> HTML파일에선 th:text="${작명}"
    String write() {
        return "write.html";
    }

    @PostMapping("/add")
// HTML에 서버데이터 넣으려면 -> 파라미터에 Model model -> model.addAttribute(작명,데이터) -> HTML파일에선 th:text="${작명}"
    String addPost(String title, Integer price) {
        Item item = new Item();//DB 입출력 기능
        item.setTitle(title);
        item.setPrice(price);
        itemRepository.save(item);
        return "redirect:/list";
    }

    @GetMapping("/detail/{id}")
    String detail(@PathVariable Long id, Model model) {
        Optional<Item> result = itemRepository.findById(id);
        if (result.isPresent()) {
            model.addAttribute("data", result.get());
            return "detail.html";
        } else {
            return "redirect:/list";
        }
    }
}


//var a = new ArrayList<>();
//        a.add(30);
//        a.add(4600);
//        a.add(50);
//        a.add(10);
//        System.out.println(a.get(1));
//        System.out.println(a.get(3));