package EcommerceLoginRegisterSystem.dataAccess.abstracts;

import java.util.List;

import EcommerceLoginRegisterSystem.entites.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delate(User user);
	void addwithGoogle(User user);
	List<User> getAll();
}
