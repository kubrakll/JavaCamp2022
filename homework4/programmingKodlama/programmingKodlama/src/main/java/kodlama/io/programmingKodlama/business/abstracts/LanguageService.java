package kodlama.io.programmingKodlama.business.abstracts;

import java.util.List;

import kodlama.io.programmingKodlama.business.requests.CreateLanguage;
import kodlama.io.programmingKodlama.business.responses.GetAllLanguageResponse;

public interface LanguageService {

	List<GetAllLanguageResponse> getAll();
	
	void add(CreateLanguage createLanguage) throws Exception;
	
	void delete(int id);
	
	void update(int id);
}
