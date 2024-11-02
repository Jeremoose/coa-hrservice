package nl.coa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "adres")
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies auto-incrementing field
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "postcode", nullable = false, length = 6) // Length matches VARCHAR(6)
    private String postcode;

    @Column(name = "nummer", nullable = false)
    private int nummer;

    @Column(name = "toevoeging")
    private String toevoeging;


    public  Adres(){

    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getToevoeging() {
        return toevoeging;
    }

    public void setToevoeging(String toevoeging) {
        this.toevoeging = toevoeging;
    }
}
