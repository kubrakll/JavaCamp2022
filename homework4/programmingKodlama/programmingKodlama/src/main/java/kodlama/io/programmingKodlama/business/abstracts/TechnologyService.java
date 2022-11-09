package kodlama.io.programmingKodlama.business.abstracts;

import java.util.List;

import kodlama.io.programmingKodlama.business.requests.CreateTechnology;
import kodlama.io.programmingKodlama.business.responses.GetAllTechnologyResponse;

public interface TechnologyService {

	List<GetAllTechnologyResponse> getAll();
	
	void add(CreateTechnology createTechnology) throws Exception;
	
	void delete(int id);
	
	void update(int id);
}
