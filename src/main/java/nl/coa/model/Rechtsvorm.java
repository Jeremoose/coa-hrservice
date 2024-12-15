package nl.coa.model;
import jakarta.persistence.*;

@Entity
@Table(name = "rechtsvorm")
public class Rechtsvorm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "type", length = 20)
    private String type;



    public Rechtsvorm() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
