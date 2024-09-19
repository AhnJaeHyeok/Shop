//package com.apple.shop;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
//
//@ControllerAdvice
//public class MyExceptionHandler {
//    //모든 API 에러를 캐치
//    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
//    public ResponseEntity<String> handler1() {
//        return ResponseEntity.status(400).body("에러남");
//    }
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handler() {
//        return ResponseEntity.status(400).body("에러남");
//    }
//}
