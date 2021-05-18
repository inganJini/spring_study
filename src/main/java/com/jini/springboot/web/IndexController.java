package com.jini.springboot.web;

import com.jini.springboot.config.auth.dto.SessionUser;
import com.jini.springboot.service.posts.PostsService;
import com.jini.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;
    private final HttpSession httpSession;

    // View Resolver가 처리
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());

        // 앞서 작성된 CustomOAuth2UserService에서 로그인 성공시 세션에 SessionUser를 저장하도록 구성했습니다.
        // 즉 로그인 성공 시 httpSession.getAttribute("user")에서 값을
        SessionUser user = (SessionUser)httpSession.getAttribute("user");
        if (user != null) {
            model.addAttribute("userName", user.getName());
        }

        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave() {
        return "posts-save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsUpdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("post", dto);

        return "posts-update";
    }
}
