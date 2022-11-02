package kodlama.io.Devs.KodlamaioDevs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.KodlamaioDevs.entities.concretes.Language;

public interface LanguageService {

List<Language> getAll();
	
	public Language getById(int id);
	public void  add(Language language) throws Exception;
	public void  delete(int id);
	public void  update(int id);
}
