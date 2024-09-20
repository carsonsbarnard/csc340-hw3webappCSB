package com.csc340.StaticWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticController {

    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/about")
    public String about() {
        return "about"; // returns about.html
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact"; // returns about.html
    }
}