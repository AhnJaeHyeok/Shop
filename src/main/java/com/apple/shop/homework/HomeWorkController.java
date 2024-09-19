//package com.apple.shop;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@Controller
//
//public class HomeWorkController {
//
//    private final HomeWorkRepository homeWorkRepository;
//
//    @GetMapping("/homework")
//    String homework(Model model) {
//        List<Homework> homeworkList = homeWorkRepository.findAll();
//        model.addAttribute("homeworks", homeworkList);
//        var b = new Homework();
//        System.out.println(b.toString());
//        return "home.html";
//
//    }
//
//}
