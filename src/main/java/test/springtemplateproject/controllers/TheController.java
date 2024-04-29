package test.springtemplateproject.controllers;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import test.springtemplateproject.entities.Evenement;
import test.springtemplateproject.entities.Participant;
import test.springtemplateproject.repositories.ParticipantRepository;
import test.springtemplateproject.services.IMyServices;

import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
@RequestMapping("examen/blanc")
public class TheController {
    IMyServices services;
    ParticipantRepository participantRepository;
    @PostMapping("/ajout-participant")
    public Participant ajouterParticipant (@RequestBody Participant p){
        return services.ajouterParticipant(p);
    }
    @PostMapping("/ajout-event-and-affect")
    public Evenement ajoutEvenement(@RequestBody Evenement e){
        return services.ajoutAffectEvenParticip(e);
    }
    @GetMapping("tous-les-evenement")
    public List<Evenement> getAllEvenement(){
        return services.getAllEvents();
    }

    @GetMapping("tous-les-participant")
    public List<Participant> getAllParticipants(){
        return participantRepository.findAll();
    }
}
