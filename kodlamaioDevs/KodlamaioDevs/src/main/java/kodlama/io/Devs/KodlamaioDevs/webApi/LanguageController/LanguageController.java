package kodlama.io.Devs.KodlamaioDevs.webApi.LanguageController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.KodlamaioDevs.business.abstracts.LanguageService;
import kodlama.io.Devs.KodlamaioDevs.entities.concretes.Language;


@RestController
@RequestMapping("/api/language")

public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<Language> getall(){
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public Language getByID(int id){
		return languageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(Language language) throws Exception {
		this.languageService.add(language);
	}
	
	@GetMapping("/update")
	public void update(int id){
		this.languageService.update(id);
	}
	
	@GetMapping("/delete")
	public void delete(int id){
		this.languageService.delete(id);
	}
	
	
}
