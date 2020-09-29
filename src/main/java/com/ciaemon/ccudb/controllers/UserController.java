package com.ciaemon.ccudb.controllers;

import com.ciaemon.ccudb.models.User;
import com.ciaemon.ccudb.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping()
    public String all(Model model) {
        model.addAttribute("users", userRepo.findAll());

        return "user/all";
    }
    @GetMapping("/{id}")
    public String find(@PathVariable("id") int id, Model model) {
        model.addAttribute("user",
                userRepo.findById(id).orElse(null));
        return "user/card";
    }
    @GetMapping("/new")
    public String newUser(@ModelAttribute User user) {
        return "user/new";
    }
    @PostMapping()
    public String create(@ModelAttribute("user") User user) {
        userRepo.save(user);
        return "redirect:/user/" + user.getId();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        userRepo.deleteById(id);
        return "/user/all";
    }
}
