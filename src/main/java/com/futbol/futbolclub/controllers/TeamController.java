package com.futbol.futbolclub.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
@GetMapping("/team")
    public String teamMain(Model model){
    return "team-main";
}
}
