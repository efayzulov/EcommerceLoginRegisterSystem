package EcommerceLoginRegisterSystem.business.concretes;

import java.util.regex.Pattern;

import EcommerceLoginRegisterSystem.business.abstracts.CHeckMailService;
import EcommerceLoginRegisterSystem.business.abstracts.UserService;
import EcommerceLoginRegisterSystem.core.abstracts.LoggerService;
import EcommerceLoginRegisterSystem.dataAccess.abstracts.UserDao;
import EcommerceLoginRegisterSystem.entites.concretes.User;

public class UserManager implements UserService {
	private UserDao userDao;
	private CHeckMailService cHeckMailService;
	private LoggerService loggerService;
	
	public UserManager(UserDao userDao, CHeckMailService cHeckMailService, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.cHeckMailService = cHeckMailService;
		this.loggerService = loggerService;
	}
	
	@Override
	public void register(User user) {
		String regex="(?simx)\\b[A-Z0-9._%+-]+" + "@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b";
		boolean isEmail=Pattern.matches(regex, user.getEmail());
		boolean repeatMail=false;
		
		if(user.getFirstname()==null|| user.getLastName()==null || user.getEmail()==null || user.getPassword()==null) {
			System.out.println("Bo� alan b�rakmay�n�z");
		}
		
		else if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");		
		}
		
		else if (!isEmail) {
			System.out.println("E-Posta alan� e-posta fortmat�nda olmal�d�r. (format.example@gmail.com)");
		}
		
		else if (repeatMail) {
			System.out.println("Bu mail adres daha �nce kullna�lm��t�r. ");
		}
		
		System.out.println("Mail adresinize gelen do�rulama linkine t�klay�n�z. ");
		System.out.println("Mail onaylama i�lemi ba�ar�yla tamaland�. ");

		userDao.add(user);
		
	}

	@Override
	public void registerWithGoogle(User user) {
		userDao.addwithGoogle(user);
		
	}

	@Override
	public void login(User user) {
		if (user.getEmail() == null || user.getPassword() == null) {
			System.out.println("Giri� yapamak istedi�iniz kullan�c� bilgilerini giriniz . ");
		}
		else {
			System.out.println("Kullan�c� giri� i�lemi ba�ar�l� . ");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� hesab� ba�ar�l� bir �ekilde silindi .");
		
	}

}
