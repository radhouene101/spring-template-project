package test.springtemplateproject.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springtemplateproject.entities.Evenement;
import test.springtemplateproject.entities.Participant;
import test.springtemplateproject.repositories.EvenementRepository;
import test.springtemplateproject.repositories.ParticipantRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class MyServicesImpl implements IMyServices {
    @Autowired
    private final ParticipantRepository participantRepository;
    @Autowired
    private final EvenementRepository evenementRepository;
    @Override
    public Participant ajouterParticipant(Participant p) {
        return participantRepository.save(p);
    }

    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        return evenementRepository.save(e);
    }

    @Override
    public List<Evenement> getAllEvents() {
        return evenementRepository.findAll();
    }


}
