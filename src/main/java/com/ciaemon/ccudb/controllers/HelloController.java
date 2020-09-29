package com.ciaemon.ccudb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Objects;

@Controller
public class HelloController {
    static int i;
    @GetMapping("/hello")
    public String helloPage(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", Objects.requireNonNullElse(name, "robot"));
        return "hello";
    }
}
