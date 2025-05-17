package com.example.mintur.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Kjoregodtgjorelse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dato;
    private String fraAdresse;
    private String tilAdresse;
    private String formål;
    private String biltype;
    private double kilometer;
    private boolean passasjer;
    private double bomavgift;
    private double belop;

    // Gettere og settere
    public Long getId() { return id; }
    public LocalDate getDato() { return dato; }
    public void setDato(LocalDate dato) { this.dato = dato; }

    public String getFraAdresse() { return fraAdresse; }
    public void setFraAdresse(String fraAdresse) { this.fraAdresse = fraAdresse; }

    public String getTilAdresse() { return tilAdresse; }
    public void setTilAdresse(String tilAdresse) { this.tilAdresse = tilAdresse; }

    public String getFormål() { return formål; }
    public void setFormål(String formål) { this.formål = formål; }

    public String getBiltype() { return biltype; }
    public void setBiltype(String biltype) { this.biltype = biltype; }

    public double getKilometer() { return kilometer; }
    public void setKilometer(double kilometer) { this.kilometer = kilometer; }

    public boolean isPassasjer() { return passasjer; }
    public void setPassasjer(boolean passasjer) { this.passasjer = passasjer; }

    public double getBomavgift() { return bomavgift; }
    public void setBomavgift(double bomavgift) { this.bomavgift = bomavgift; }

    public double getBelop() { return belop; }
    public void setBelop(double belop) { this.belop = belop; }
}
