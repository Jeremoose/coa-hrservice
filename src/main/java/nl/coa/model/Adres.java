package nl.coa.model;

import jakarta.persistence.Entity;

@Entity
public class Adres {
    private int id;
    private String postcode;
    private int nummer;
    private String toevoeging;

    public  Adres(){

    }
}
