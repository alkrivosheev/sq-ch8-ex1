package ru.job4j.sqch8ex1.queryParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    @RequestMapping("/home")
    public String home(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String color,
            Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "home.html";
    }
}
