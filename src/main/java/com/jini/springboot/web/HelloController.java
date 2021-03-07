package com.jini.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌
public class HelloController {

    // HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어줌
    // /hello로 요청이 오면 문자열 hello를 반환
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
