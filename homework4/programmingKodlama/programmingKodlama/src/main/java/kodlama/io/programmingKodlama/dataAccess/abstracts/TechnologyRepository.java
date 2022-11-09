package kodlama.io.programmingKodlama.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.programmingKodlama.entities.concretes.ProgrammingLanguageTechnology;

public interface TechnologyRepository extends JpaRepository<ProgrammingLanguageTechnology, Integer> {

}
