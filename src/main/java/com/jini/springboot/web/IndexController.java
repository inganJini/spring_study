package com.jini.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // View Resolver가 처리
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
