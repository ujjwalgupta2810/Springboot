package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("theme", "light-theme");  // Default theme
        return "home";  // Return home template where 'bodyContent' is defined
    }

    @GetMapping("/")
    public String happyHome(Model model) {
        model.addAttribute("theme", "light-theme");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("theme", "light-theme");
        return "about";  // Return about template
    }

    @RequestMapping("/services")
    public String servicesPage(Model model) {
        model.addAttribute("theme", "light-theme");
        return "services";  // Return services template
    }
}
