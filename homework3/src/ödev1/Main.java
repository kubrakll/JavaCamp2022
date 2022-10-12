package ödev1;

public class Main {

	public static void main(String[] args) {

/***************************************************************************************************
		int number=10;
		int number2=20;
		number=number2;
		number2=100;		
		System.out.println(number); //Çýktý:20

		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 10, 20, 30 };
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]); // Çýktý:100	
			 
***************************************************************************************************

		CreditManager creditManager= new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer(); //örneðini oluþturmak, instance oluþturmak, instance cration. Heap de referance numarasýný oluþturmak demek
		customer.setId(1);
		customer.setCity("Ýstanbul");
			
		Person person=new Person();
		person.setFirstName("Kübra");
		person.setLastName("Kýlýç");	
		person.setNationalIdentity("123");	
		
		CustomerManager customerManager= new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company= new Company();
		company.setId(2);
		company.setCompanyName("Arçelik");
		company.setTaxtNumber("1000");
		
		CustomerManager customerManager2= new CustomerManager(new Company());	
		Customer c1=new Customer();
		Customer c2= new Person();
		Customer c3=new Company();
		
***************************************************************************************************/
	

		CustomerManager customerManager=new CustomerManager(new Customer(), new TeacherCrediManager());
		customerManager.GiveCredit();
		
		/************************************************************************************************************************
		 * Class nedir ?                                                                                                        *
		 * 		Ýçerisinde yapacaðýmýz iþlemleri veya bilgileri tutan yapýlardýr.                                               * 
		 * 		Sýnýflar sayesinde programlar parçalara bölünür ve karmaþýklýðý azalýr.                                         *
		 * 		Bir sýnýf kendisinde oluþturulacak nesneler için bir takým üyeler içermelidir.                                  *
		 *  	Bu üyeler; 																		                                *
		 *  		alanlar (fields) 															                                *
		 *  		metodlar (methods) 															                                *
		 *  		yapýcýlar (constructor)														                                *
		 *  		özellikler (properties) 												 	                                *
		 *  		olaylar (events) 														                                    *
		 *  		delegeler(delegates) vb...dir 												                                *
		 *                                                                                                                      *
		 * SOLID 																											    *
		 * 		S(Single-responsibility principle) : ani bir sýnýfýn yapmasý gereken yalnýzca 	                                *
		 * 			bir iþi olmasý gerekir.																					    *
		 * 		O(Open-closed principle): Her class geliþtirmeye açýk olmalý fakat deðiþime kapalý 								*
		 * 			olmadýlýr.						      *																		*
		 * 		L(Liskov substitution principle): Türetilen sýnýflar, türeyen sýnýflarýn tüm özelliklerini 						*
		 * 			kullanmak zorundadýr		      																			*
		 * 		I(Interface segregation principle): her interface’in belirli bir amacý olmalýdýr. 							    *
		 * 			Tüm metodlarý kapsayan tek bir interface kullanmak yerine, herbiri ayrý metod gruplarýna 					*
		 * 			hizmet veren birkaç 	      																				*
		 * 			interface tercih edilmektedir.																			    *
		 * 		D(Dependency Inversion Principle): Üst seviye (High-Level) sýnýflar, alt seviye (Low-Level) 					*
		 * 			sýnýflara baðlý olmamalýdýr. Ýliþki abstraction veya interface kullanarak saðlanmalýdýr. 					*	
		 * 																		 												*
		 * Interface Nedir ?																									*
		 * 		iþ yapan sýnýflarýn operasyonlarýnýn(manager) sadece imza seviyesinde yazarak yazýlýmda baðýmlýlýðý 			*
		 * 		korumak adýna yapýlan çalýþmadýr. Ortak sýnýflarýn imzasýný barýndýrýr. Interface üzerinde tanýmlanan 			*
		 * 		metotlar gövdesizdir. New lenemezler.																			*
		 * 		Ýnterfaceler REFERANS tiptir. eferans tiplerin özelliklerinde yararlanýr.										*
		 * 		Amacý: Yazýlýmdaki baðýmlýlýklarý engellemek iflerden kurtulmaktýr.												*
		 * 																														*
		 * Abstract Class Nedir ?																								*
		 * 		Ortak operasyanlarý tutar. New lenemez. Referans tiplerin özelliklerinde yararlanýr.							*
		 * 		Ortak olup deðiþeni sadece imza olarak býrakýrýz(Ör: public absract void Calculate();)							*
		 * 		Ortak olup deðiþmeyi doldururuz(Ör: public void Save(){sysout})													*
		 * 																														*
		 * 																														*
		 * KURAL: Bir sýnýf sadece bir sýnýfý inherit edebilir.																	*
		 * 		  Bir sýnýf birden fazla interface implement  edebilir.															*
		 * 																														*
		 ************************************************************************************************************************/

		
		
		
		
	}

}
