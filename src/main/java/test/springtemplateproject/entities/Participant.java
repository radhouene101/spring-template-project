package test.springtemplateproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPart;
    private String nom;
    private String prenom;
    private Tache tache;
    @ManyToMany
    private List<Evenement> evenements;

}
