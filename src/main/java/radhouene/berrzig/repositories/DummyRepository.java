package radhouene.berrzig.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import radhouene.berrzig.entities.DummyEntity;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Integer> {

}
