package utils;

import java.util.Base64.Encoder;

import pojo.Credentials;

//base64 format:is group of binary  to text encoding  into ASCII format  to avoid security issues
public class Base64UnderstandingLogic {

	// username :admin
	// password :admin123

	// admin:admin123

	public static Credentials base64encode(final String username, final String password) {
		String cred = username + ";" + password;

		try {

			cred= java.util.Base64.getEncoder().encodeToString(cred.getBytes());//first converted  into bytes then in Ascii fomrat
			System.out.println(cred);
		} catch (Exception e)

		{
			// to handle exception
		}
		Credentials logincred= new  Credentials();
		logincred.setCredentials(cred);
		
		
		return logincred;
	}

//to check weather it is working or not
	
	public static void main(String[] args) {
		
		Base64UnderstandingLogic base= new Base64UnderstandingLogic ();
		base.base64encode("admin", "admin123");
		
	}//here the output is encrepted format
	
	
	

}
