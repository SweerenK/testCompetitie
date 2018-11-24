package nl.test.Competitie.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import nl.test.Competitie.domain.*;

@Component
public interface ScoreRepository extends CrudRepository <Score, Long>{

}
