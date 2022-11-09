package kodlama.io.programmingKodlama.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingKodlama.entities.concretes.ProgrammingLanguage;



public interface LanguageRepository extends JpaRepository<ProgrammingLanguage, Integer>{

	
}
