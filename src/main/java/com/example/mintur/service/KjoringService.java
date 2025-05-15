package com.example.mintur.service;


import com.example.mintur.model.Kjoring;
import com.example.mintur.repository.KjoringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KjoringService {

    // Husk å deklarere repo som en klassevariabel
    @Autowired
    private KjoringRepository repo;

    public Kjoring lagre(Kjoring kjoring) {
        return repo.save(kjoring);  // Her brukes 'repo'
    }

    public List<Kjoring> hentAlle() {
        return repo.findAll();
    }

    public double totalGodtgjorelse() {
        return repo.findAll().stream()
                .mapToDouble(k -> k.getKilometer() * 4.48)
                .sum();
    }
}
