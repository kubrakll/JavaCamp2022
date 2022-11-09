package kodlama.io.programmingKodlama.webApi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.programmingKodlama.business.abstracts.LanguageService;
import kodlama.io.programmingKodlama.business.requests.CreateLanguage;
import kodlama.io.programmingKodlama.business.requests.UpdateLanguage;
import kodlama.io.programmingKodlama.business.responses.GetAllLanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<GetAllLanguageResponse> getall(){
		return languageService.getAll();
	}
	
	
	@DeleteMapping("/delete/{id}")
	public List<GetAllLanguageResponse> getdelete(@PathVariable("id") int id){
		languageService.delete(id);
		return languageService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateLanguage createLanguage)throws Exception{
		this.languageService.add(createLanguage);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable int id, UpdateLanguage updateLanguage){
		this.languageService.update(id);
	}
}
