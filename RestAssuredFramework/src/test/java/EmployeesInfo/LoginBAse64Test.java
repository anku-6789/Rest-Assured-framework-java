package EmployeesInfo;

import org.testng.annotations.Test;

import pojo.Credentials;
import utils.Base64UnderstandingLogic;

public class LoginBAse64Test {

	
	
	@Test
	 
	public  void loginbase64()
	{
		
		Credentials logincred = Base64UnderstandingLogic.base64encode("admin", "admin123");
		
		System.out.println(logincred);
	}
	
}
