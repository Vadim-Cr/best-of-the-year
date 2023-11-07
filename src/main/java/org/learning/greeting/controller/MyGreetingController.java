package org.learning.greeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Scanner;

@Controller
@RequestMapping("/")
public class MyGreetingController {


    @GetMapping("/")
    @ResponseBody
    public String greeting() {
        return "Ciao";
    }

    @GetMapping("home")
    public String home(Model model) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name");
        String yourName = scanner.nextLine();
        model.addAttribute("yourName", yourName);
        return "home";
    }
}
