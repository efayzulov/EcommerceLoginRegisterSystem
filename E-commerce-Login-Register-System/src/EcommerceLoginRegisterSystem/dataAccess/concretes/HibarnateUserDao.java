package EcommerceLoginRegisterSystem.dataAccess.concretes;

import java.util.List;

import EcommerceLoginRegisterSystem.dataAccess.abstracts.UserDao;
import EcommerceLoginRegisterSystem.entites.concretes.User;

public class HibarnateUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("Veri eklendi : " + user.getFirstname() + "" + user.getLastName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delate(User user) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addwithGoogle(User user) {
		System.out.println("Google hasab�n�zla kay�t i�lemi ba�ar�l� �ekilde ger�ekle�tirilmi�tir. ");
		
	}

}
