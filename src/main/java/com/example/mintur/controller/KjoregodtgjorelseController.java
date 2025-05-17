package com.example.mintur.controller;

import com.example.mintur.model.Kjoregodtgjorelse;
import com.example.mintur.service.KjoregodtgjorelseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class KjoregodtgjorelseController {

    private final KjoregodtgjorelseService service;

    public KjoregodtgjorelseController(KjoregodtgjorelseService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("turer", service.hentAlle());
        model.addAttribute("nyTur", new Kjoregodtgjorelse());
        return "index";
    }

    @PostMapping("/lagreTur")
    public String lagreTur(@ModelAttribute("nyTur") Kjoregodtgjorelse tur) {
        service.lagreTur(tur);
        return "redirect:/";
    }

    @PostMapping("/slettTur/{id}")
    public String slettTur(@PathVariable Long id) {
        service.slettTur(id);
        return "redirect:/";
    }
}
