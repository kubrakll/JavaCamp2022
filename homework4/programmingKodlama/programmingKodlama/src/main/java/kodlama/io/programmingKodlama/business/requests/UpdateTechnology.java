package kodlama.io.programmingKodlama.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnology {
	private int id;
    private String name;
    private int technologyid;
}
