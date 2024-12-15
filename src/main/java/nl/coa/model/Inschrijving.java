package nl.coa.model;

import jakarta.persistence.*;
@Entity
@Table(name = "inschrijving")
public class Inschrijving {

    @Id
    @Column(name = "kvk")
    private int id;

    @Column(name = "datum")
    private String datum;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status", referencedColumnName = "id", nullable = true)
    private Status status;

    @Column(name = "bedrijfsnaam", length = 50)
    private String bedrijfsnaam;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rechtsvorm", referencedColumnName = "id", nullable = true)
    private Rechtsvorm rechtsvorm;

    @ManyToOne(fetch = FetchType.EAGER )
    @JoinColumn(name = "ma", referencedColumnName = "id", nullable = true)
    private Ma ma;


    public Inschrijving() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getBedrijfsnaam() {
        return bedrijfsnaam;
    }

    public void setBedrijfsnaam(String bedrijfsnaam) {
        this.bedrijfsnaam = bedrijfsnaam;
    }

    public Rechtsvorm getRechtsvorm() {
        return rechtsvorm;
    }

    public void setRechtsvorm(Rechtsvorm rechtsvorm) {
        this.rechtsvorm = rechtsvorm;
    }

    public Ma getMe() {
        return ma;
    }

    public void setMe(Ma ma) {
        this.ma = ma;
    }
}
