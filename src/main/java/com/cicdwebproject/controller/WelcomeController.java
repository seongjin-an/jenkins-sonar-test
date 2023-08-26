package com.cicdwebproject.controller;

import com.cicdwebproject.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
@Slf4j
public class WelcomeController {
    @GetMapping("/hello-world")
    public String index(Model model) {
        log.debug("welcome to my page");
        model.addAttribute("msg", Message.HELLO.getMsg());
        model.addAttribute("today", new Date());
        return "index";
    }
}
