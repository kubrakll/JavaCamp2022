package kodlama.io.Devs.KodlamaioDevs.dataAccess.concretes;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.KodlamaioDevs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.KodlamaioDevs.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> language;

	public InMemoryLanguageRepository() {
		language.add(new Language(1, "C#"));
		language.add(new Language(2, "Python"));
		language.add(new Language(3, "Java"));
	}

	@Override
	public List<Language> getAll() {
		return language;
	}

	@Override
	public Language getById(int id) {
		for (Language language2 : language) {
			if (language2.getId() == id) {
				return language2;
			}
		}
		return null;
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getName() == null) {
			throw new Exception("Programlama Adı boş geçilemez");
		} else {
			for (Language language3 : this.language) {
				if (language3.getName() == language.getName()) {
					throw new Exception("Programlama isimleri tekrar edemez");
				}
			}
			this.language.add(language);
		}

	}

	@Override
	public void delete(int id) {
		for (Language language2 : language) {
			if (language2.getId() == id) {
				this.language.remove(id);
			}
		}

	}

	@Override
	public void update(int id) {
		for (Language language2 : language) {
			if (language2.getId() == id) {
				language2.setId(id);
			}
		}

	}

}
