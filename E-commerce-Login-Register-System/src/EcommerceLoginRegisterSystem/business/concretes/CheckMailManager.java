package EcommerceLoginRegisterSystem.business.concretes;

import EcommerceLoginRegisterSystem.business.abstracts.CHeckMailService;

public class CheckMailManager  implements CHeckMailService{

	@Override
	public void checkMail(String messages) {
		System.out.println(messages);	
	}

}
