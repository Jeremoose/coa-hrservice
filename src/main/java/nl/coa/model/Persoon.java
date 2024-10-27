package nl.coa.model;

import jakarta.persistence.Entity;

@Entity
public class Persoon {
    private int id;
    private String naam;
    private String voorletters;
    private String email;
    private Adres adres;

    public Persoon(){}
}
