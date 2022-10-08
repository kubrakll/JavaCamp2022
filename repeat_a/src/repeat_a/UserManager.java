package repeat_a;

public class UserManager {

	private User _user;

	public UserManager(User user) {
		_user = user;
	}

	public void Add() {
		if(_user.name==null)
        {
            System.out.println("Null Error");
        }
		else {
			System.out.println("Kullanýcý eklendi " + _user.name);

		}
	}

	public void Delete() {
		System.out.println("Kullanýcý silindi " + _user.name + " "+ _user.surname);
	}

}
