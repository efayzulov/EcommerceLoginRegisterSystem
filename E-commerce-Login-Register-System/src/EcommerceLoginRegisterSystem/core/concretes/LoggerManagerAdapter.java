package EcommerceLoginRegisterSystem.core.concretes;

import EcommerceLoginRegisterSystem.core.abstracts.LoggerService;
import EcommerceLoginRegisterSystem.gMaiLogger.LoginManager;

public class LoggerManagerAdapter implements LoggerService {

	@Override
	public void loginWithGoogle(String message) {
		LoginManager lManager = new LoginManager(); 
		lManager.login(message);
	}
}

			
		

