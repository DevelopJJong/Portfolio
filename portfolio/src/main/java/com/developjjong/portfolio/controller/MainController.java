package com.developjjong.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String welcome(){
        return "open";
    }

    @GetMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }

    @GetMapping("/project")
    public String project(){
        return "project";
    }



    @GetMapping("/skills")
    public String skills(){
        return "skills";
    }

}
