package kodlama.io.programmingKodlama.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingKodlama.business.abstracts.TechnologyService;
import kodlama.io.programmingKodlama.business.requests.CreateTechnology;
import kodlama.io.programmingKodlama.business.responses.GetAllTechnologyResponse;
import kodlama.io.programmingKodlama.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.programmingKodlama.entities.concretes.ProgrammingLanguageTechnology;

@Service 
public class TechnologyManager implements TechnologyService {

	private  TechnologyRepository technologyRepository;
	
	
	@Autowired
	public TechnologyManager(TechnologyRepository technologyRepository) {
		this.technologyRepository = technologyRepository;
	}

	@Override
	public List<GetAllTechnologyResponse> getAll() {
		List<ProgrammingLanguageTechnology> languageFrameworks = this.technologyRepository.findAll();
		List<GetAllTechnologyResponse> languagesFrameworkResponse = new ArrayList<GetAllTechnologyResponse>();
				
		for(ProgrammingLanguageTechnology programmingLanguageTechnology : languageFrameworks) {
			GetAllTechnologyResponse getAllTechnologyResponse = new GetAllTechnologyResponse();
			getAllTechnologyResponse.setId(programmingLanguageTechnology.getId());
			getAllTechnologyResponse.setId(programmingLanguageTechnology.getTechnologyid());
			getAllTechnologyResponse.setName(programmingLanguageTechnology.getName());
			languagesFrameworkResponse.add(getAllTechnologyResponse);
		}
		return languagesFrameworkResponse;
	}


	@Override
	public void add(CreateTechnology createTechnology) throws Exception {
		ProgrammingLanguageTechnology language = new ProgrammingLanguageTechnology();
		language.setName(createTechnology.getName());

		this.technologyRepository.save(language);
		
	}

	@Override
	public void delete(int id) {
		ProgrammingLanguageTechnology programmingLanguageTechnology = new ProgrammingLanguageTechnology();	
		programmingLanguageTechnology.setId(id);
		this.technologyRepository.delete(programmingLanguageTechnology);
		
	}

	@Override
	public void update(int id) {
		ProgrammingLanguageTechnology language = new ProgrammingLanguageTechnology();	
		language.setId(id);
		this.technologyRepository.save(language);
		
	}

}
