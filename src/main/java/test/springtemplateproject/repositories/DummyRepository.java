package test.springtemplateproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.springtemplateproject.entities.DummyEntity;


import java.util.List;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Integer> {

}
