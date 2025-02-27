package com.example.thymleaf.Controller;
import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Home(Model model){
        model.addAttribute("name", "World");
        return "index";
    }
}
