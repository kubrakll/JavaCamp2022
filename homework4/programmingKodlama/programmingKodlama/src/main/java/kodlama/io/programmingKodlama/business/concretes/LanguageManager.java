package kodlama.io.programmingKodlama.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingKodlama.business.abstracts.LanguageService;
import kodlama.io.programmingKodlama.business.requests.CreateLanguage;
import kodlama.io.programmingKodlama.business.responses.GetAllLanguageResponse;
import kodlama.io.programmingKodlama.dataAccess.abstracts.LanguageRepository;
import kodlama.io.programmingKodlama.entities.concretes.ProgrammingLanguage;

@Service // bu sınıf business nesnesidir
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguageResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguage = this.languageRepository.findAll();
		List<GetAllLanguageResponse> getAllLanguageResponse = new ArrayList<GetAllLanguageResponse>();

		for (ProgrammingLanguage programmingLang : programmingLanguage) {
			GetAllLanguageResponse response = new GetAllLanguageResponse(programmingLang.getId(),
					programmingLang.getName());
			getAllLanguageResponse.add(response);
		}
		return getAllLanguageResponse;
	}


	@Override
	public void add(CreateLanguage createLanguage) throws Exception {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(createLanguage.getName());

		this.languageRepository.save(language);

	}

	@Override
	public void delete(int id) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(id);
		this.languageRepository.delete(language);

	}

	@Override
	public void update(int id) {
		ProgrammingLanguage language = new ProgrammingLanguage();	
		language.setId(id);
		this.languageRepository.save(language);
	}

}
