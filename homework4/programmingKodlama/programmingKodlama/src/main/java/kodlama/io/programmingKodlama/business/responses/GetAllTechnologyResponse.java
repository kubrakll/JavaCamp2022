package kodlama.io.programmingKodlama.business.responses;

import kodlama.io.programmingKodlama.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologyResponse {

	 private int id;
	 private String name;
	 private ProgrammingLanguage language;
}
