package test.springtemplateproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String description;
    private Date datedebut;
    private Date datefin;
    float cout;
    @ManyToMany
    private List<Participant> participants;
    @OneToMany
    private List<Logistique> logistique;


}
