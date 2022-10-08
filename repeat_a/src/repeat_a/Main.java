package repeat_a;

public class Main {

	public static void main(String[] args) {
		
		User user=new User();
		user.name="Kübra";		
		user.surname="Kýlýç";
		user.age=24;
		user.gender="K";
		
		Doctor doctor1=new Doctor();
		doctor1.name="Efe";
		doctor1.surname="Kýlýç";
		doctor1.age=30;
		doctor1.gender="E";
		doctor1.setDoctortID("1");
		doctor1.setDoctorTitle("Opr. Dr.");
		
		
		UserManager userManager=new UserManager(user);
		userManager.Add();
		
		UserManager userManager2=new UserManager(doctor1);
		userManager2.Add();
		
		
	}

}
