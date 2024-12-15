package nl.coa.model;
import jakarta.persistence.*;
@Entity
@Table(name = "ma")
public class Ma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies auto-incrementing field
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "beschrijving", length = 200)
    private String beschrijving;

    @Column(name = "sbi")
    private int sbi;

    public Ma() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public int getSbi() {
        return sbi;
    }

    public void setSbi(int sbi) {
        this.sbi = sbi;
    }
}
