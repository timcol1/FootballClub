package com.futbol.futbolclub.controllers;

import com.futbol.futbolclub.models.Players;
import com.futbol.futbolclub.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeamController {
    @Autowired
    private PlayersRepository playersRepository;

@GetMapping("/team")
    public String teamMain(Model model){
    model.addAttribute("desk", "Гравці команди");
    Iterable<Players> players = playersRepository.findAll();
    model.addAttribute("players",players);
    return "team-main";
    }
}
