package kodlama.io.Devs.KodlamaioDevs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.KodlamaioDevs.business.abstracts.LanguageService;
import kodlama.io.Devs.KodlamaioDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.KodlamaioDevs.entities.concretes.Language;


@Service 
public class LanguageManacer implements LanguageService{

	private LanguageRepository languageRepository;
	
	
	
	public LanguageManacer(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();
	}

	@Override
	public Language getById(int id) {
		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language) throws Exception {
		this.languageRepository.add(language);
		
	}

	@Override
	public void delete(int id) {
		this.languageRepository.delete(id);
		
	}

	@Override
	public void update(int id) {
		this.languageRepository.update(id);
		
	}

}
