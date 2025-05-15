package com.example.mintur.controller;

import com.example.mintur.model.Kjoring;
import com.example.mintur.service.KjoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class KjoringWebController {

    @Autowired
    private KjoringService service;

    @GetMapping("/")
    public String visSkjema(Model model) {
        model.addAttribute("kjoring", new Kjoring());
        model.addAttribute("alleTurer", service.hentAlle());
        model.addAttribute("total", service.totalGodtgjorelse());
        return "index";
    }

    @PostMapping("/lagre")
    public String lagreTur(@ModelAttribute Kjoring kjoring) {
        service.lagre(kjoring);
        return "redirect:/";
    }
}
