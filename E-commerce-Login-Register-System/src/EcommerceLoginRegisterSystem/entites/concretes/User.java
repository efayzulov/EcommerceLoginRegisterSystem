package EcommerceLoginRegisterSystem.entites.concretes;

import EcommerceLoginRegisterSystem.entites.abstracts.Entity;

public class User implements Entity{
	
	 int id;
	 String Firstname;
	 String LastName;
	 String email;
	 String password;
	 String verifyCode;
	
	public User() {}

	public User(int id, String firstname, String lastName, String email, String password) {
		super();
		this.id = id;
		Firstname = firstname;
		LastName = lastName;
		this.email = email;
		this.password = password;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}
}

	