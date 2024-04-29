package test.springtemplateproject.services;

import test.springtemplateproject.entities.Evenement;
import test.springtemplateproject.entities.Participant;

import java.util.List;

public interface IMyServices {
    Participant ajouterParticipant (Participant p);
    Evenement ajoutAffectEvenParticip (Evenement e);
    List<Evenement> getAllEvents();
}
