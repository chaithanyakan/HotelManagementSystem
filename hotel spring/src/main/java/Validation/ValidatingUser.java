package Validation;

import java.io.Serializable;

public class ValidatingUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean validate(String user,String pass) {
		if(user.equals(username) && pass.equals(password)) {
			return true;
	    }
		else 
		{
		return false;
	    }
	}
}
