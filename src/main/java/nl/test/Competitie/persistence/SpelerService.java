package nl.test.Competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.test.Competitie.domain.*;

@Service
@Transactional
public class SpelerService {
	@Autowired
	private SpelerRepository spelerRepository;

	public Speler save(Speler speler){
		return spelerRepository.save(speler);
	}

	public Iterable <Speler> findAll(){
		Iterable <Speler> result = spelerRepository.findAll();
		return result;
	}
}
