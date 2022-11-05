package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	
	// List<Brand> getAll(); //Olduğu gibi veritabanı nesnesini son kullanıcıya açtık
	List<GetAllBrandsResponse> getAll();
	
	void add(CreateBrandRequest createBrandRequest);
	
}
