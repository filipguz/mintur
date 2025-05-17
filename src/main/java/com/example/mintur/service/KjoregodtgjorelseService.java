package com.example.mintur.service;

import com.example.mintur.model.Kjoregodtgjorelse;
import com.example.mintur.repository.KjoregodtgjorelseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KjoregodtgjorelseService {

    private final KjoregodtgjorelseRepository repo;

    public KjoregodtgjorelseService(KjoregodtgjorelseRepository repo) {
        this.repo = repo;
    }

    public List<Kjoregodtgjorelse> hentAlle() {
        return repo.findAll();
    }

    public Kjoregodtgjorelse lagreTur(Kjoregodtgjorelse tur) {
        double sats = 4.48;
        double belop = tur.getKilometer() * sats + tur.getBomavgift();

        if (tur.isPassasjer()) {
            belop += 20;
        }

        tur.setBelop(belop);
        return repo.save(tur);
    }

    public void slettTur(Long id) {
        repo.deleteById(id);
    }
}
