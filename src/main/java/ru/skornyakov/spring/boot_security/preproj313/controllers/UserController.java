package ru.skornyakov.spring.boot_security.preproj313.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.skornyakov.spring.boot_security.preproj313.service.UserService;

import java.security.Principal;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String pageForUser (Model model, Principal principal) {
        model.addAttribute("user", userService.findByUsername(principal.getName()));
        return "user_panel";
    }
}
