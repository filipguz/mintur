/*package com.example.mintur.controller;


import com.example.mintur.model.Kjoring;
import com.example.mintur.repository.KjoringRepository;
import com.example.mintur.service.KjoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/kjoring")
public class controller {

    @Autowired
    private KjoringService service;

    @PostMapping
    public Kjoring leggTil(@RequestBody Kjoring kjoring) {
        return service.lagre(kjoring);
    }

    @GetMapping
    public List<Kjoring> hentAlle() {
        return service.hentAlle();
    }

    @GetMapping("/total")
    public double totalGodtgjorelse() {
        return service.totalGodtgjorelse();
    }



}
*/