package nl.test.Competitie.persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import nl.test.Competitie.domain.*;

@Service
@Transactional
public class KlasseService {
	@Autowired
	private KlasseRepository klasseRepository;

	public Klasse save(Klasse klasse){
		return klasseRepository.save(klasse);
	}

	public Iterable <Klasse> findAll(){
		Iterable <Klasse> result = klasseRepository.findAll();
		return result;
	}
}
