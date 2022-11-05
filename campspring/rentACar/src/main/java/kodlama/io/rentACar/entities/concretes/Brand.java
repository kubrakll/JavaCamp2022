package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="brands")  //brands tablosu oluşturduk
//@Data //get set ve parametresiz const. oluşturuyo
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //veritabanı varlığısın deriz

public class Brand {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   //Id yi otomatik arttırma 
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	
	
}

//Brand --> id,name,quantity
//GetAllBrandsResponse -->id,name

//mapping
