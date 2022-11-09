package kodlama.io.programmingKodlama.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;

@Data
@Table(name="languagetechnology")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProgrammingLanguageTechnology {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	
	@ManyToOne()
    @JoinColumn(name = "technology_id")
	private int technologyid;
	
	@Column(name="tech_name")
	private String name;
	 
}
