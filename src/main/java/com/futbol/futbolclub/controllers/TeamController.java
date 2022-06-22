package com.futbol.futbolclub.controllers;

import com.futbol.futbolclub.models.Player;
import com.futbol.futbolclub.repository.PlayersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeamController {
    @Autowired
    private PlayersRepository playersRepository;

@GetMapping("/team")
    public String teamMain(Model model){
    model.addAttribute("desk", "Гравці команди");
    Iterable<Player> players = playersRepository.findAll();
    model.addAttribute("players",players);
    return "team-main";
    }
    @GetMapping("/team/add")
    public String playerAdd(Model model){
        model.addAttribute("tittle", "Додати гравця");
        return "player-add";
    }
    @PostMapping("/team/add")
    public String playerPostAdd(@RequestParam String name, @RequestParam String picture, @RequestParam String description, Model model){
        Player player = new Player(name, picture,description);
        playersRepository.save(player);
        return "redirect:/team";
    }
}
