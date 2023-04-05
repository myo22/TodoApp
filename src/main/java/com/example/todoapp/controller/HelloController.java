package com.example.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// spring MVC 기술 - 브라우저와 통신하는 인터페이스가 컨트롤러다.
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello"; // hello.html 를 사용하도록 하겠다. .html은 생략한것.
    }
}
