package EcommerceLoginRegisterSystem;

import EcommerceLoginRegisterSystem.business.abstracts.UserService;
import EcommerceLoginRegisterSystem.business.concretes.ChackMailManager;
import EcommerceLoginRegisterSystem.business.concretes.UserManager;
import EcommerceLoginRegisterSystem.core.abstracts.LoggerService;
import EcommerceLoginRegisterSystem.dataAccess.concretes.HibarnateUserDao;
import EcommerceLoginRegisterSystem.entites.concretes.User;
import EcommerceLoginRegisterSystem.gMaiLogger.LoginManager;

public class Main {
	
	public static void main(String[] args) {
		User user=new User(1,"User","User","user.user@gmail.com","147852");
		UserService userService=new UserManager(new HibarnateUserDao(),new  ChackMailManager(), (LoggerService) new LoginManager());
		userService.register(user);
		userService.registerWithGoogle(user);
	}

}
