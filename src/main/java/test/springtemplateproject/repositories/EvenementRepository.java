package test.springtemplateproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.springtemplateproject.entities.Evenement;

import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Integer> {

}
