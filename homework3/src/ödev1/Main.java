package �dev1;

public class Main {

	public static void main(String[] args) {

/***************************************************************************************************
		int number=10;
		int number2=20;
		number=number2;
		number2=100;		
		System.out.println(number); //��kt�:20

		int[] numbers1 = { 1, 2, 3 };
		int[] numbers2 = { 10, 20, 30 };
		numbers1 = numbers2;
		numbers2[0] = 100;
		System.out.println(numbers1[0]); // ��kt�:100	
			 
***************************************************************************************************

		CreditManager creditManager= new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer(); //�rne�ini olu�turmak, instance olu�turmak, instance cration. Heap de referance numaras�n� olu�turmak demek
		customer.setId(1);
		customer.setCity("�stanbul");
			
		Person person=new Person();
		person.setFirstName("K�bra");
		person.setLastName("K�l��");	
		person.setNationalIdentity("123");	
		
		CustomerManager customerManager= new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		Company company= new Company();
		company.setId(2);
		company.setCompanyName("Ar�elik");
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
		 * 		��erisinde yapaca��m�z i�lemleri veya bilgileri tutan yap�lard�r.                                               * 
		 * 		S�n�flar sayesinde programlar par�alara b�l�n�r ve karma��kl��� azal�r.                                         *
		 * 		Bir s�n�f kendisinde olu�turulacak nesneler i�in bir tak�m �yeler i�ermelidir.                                  *
		 *  	Bu �yeler; 																		                                *
		 *  		alanlar (fields) 															                                *
		 *  		metodlar (methods) 															                                *
		 *  		yap�c�lar (constructor)														                                *
		 *  		�zellikler (properties) 												 	                                *
		 *  		olaylar (events) 														                                    *
		 *  		delegeler(delegates) vb...dir 												                                *
		 *                                                                                                                      *
		 * SOLID 																											    *
		 * 		S(Single-responsibility principle) : ani bir s�n�f�n yapmas� gereken yaln�zca 	                                *
		 * 			bir i�i olmas� gerekir.																					    *
		 * 		O(Open-closed principle): Her class geli�tirmeye a��k olmal� fakat de�i�ime kapal� 								*
		 * 			olmad�l�r.						      *																		*
		 * 		L(Liskov substitution principle): T�retilen s�n�flar, t�reyen s�n�flar�n t�m �zelliklerini 						*
		 * 			kullanmak zorundad�r		      																			*
		 * 		I(Interface segregation principle): her interface�in belirli bir amac� olmal�d�r. 							    *
		 * 			T�m metodlar� kapsayan tek bir interface kullanmak yerine, herbiri ayr� metod gruplar�na 					*
		 * 			hizmet veren birka� 	      																				*
		 * 			interface tercih edilmektedir.																			    *
		 * 		D(Dependency Inversion Principle): �st seviye (High-Level) s�n�flar, alt seviye (Low-Level) 					*
		 * 			s�n�flara ba�l� olmamal�d�r. �li�ki abstraction veya interface kullanarak sa�lanmal�d�r. 					*	
		 * 																		 												*
		 * Interface Nedir ?																									*
		 * 		i� yapan s�n�flar�n operasyonlar�n�n(manager) sadece imza seviyesinde yazarak yaz�l�mda ba��ml�l��� 			*
		 * 		korumak ad�na yap�lan �al��mad�r. Ortak s�n�flar�n imzas�n� bar�nd�r�r. Interface �zerinde tan�mlanan 			*
		 * 		metotlar g�vdesizdir. New lenemezler.																			*
		 * 		�nterfaceler REFERANS tiptir. eferans tiplerin �zelliklerinde yararlan�r.										*
		 * 		Amac�: Yaz�l�mdaki ba��ml�l�klar� engellemek iflerden kurtulmakt�r.												*
		 * 																														*
		 * Abstract Class Nedir ?																								*
		 * 		Ortak operasyanlar� tutar. New lenemez. Referans tiplerin �zelliklerinde yararlan�r.							*
		 * 		Ortak olup de�i�eni sadece imza olarak b�rak�r�z(�r: public absract void Calculate();)							*
		 * 		Ortak olup de�i�meyi doldururuz(�r: public void Save(){sysout})													*
		 * 																														*
		 * 																														*
		 * KURAL: Bir s�n�f sadece bir s�n�f� inherit edebilir.																	*
		 * 		  Bir s�n�f birden fazla interface implement  edebilir.															*
		 * 																														*
		 ************************************************************************************************************************/

		
		
		
		
	}

}
