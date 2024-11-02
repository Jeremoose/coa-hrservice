package nl.coa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "persoon")
public class Persoon {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "naam")
    private String naam;
    @Column(name = "voorletters")
    private String voorletters;
    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "adres", referencedColumnName = "id", nullable = true)
    private Adres adres;

    public Persoon(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
}
