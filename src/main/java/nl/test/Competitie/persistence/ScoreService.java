package nl.test.Competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.test.Competitie.domain.*;

@Service
@Transactional
public class ScoreService {
	@Autowired
	private ScoreRepository scoreRepository;

	public Score save(Score score){
		return scoreRepository.save(score);
	}

	public Iterable <Score> findAll(){
		Iterable <Score> result = scoreRepository.findAll();
		return result;
	}
}
