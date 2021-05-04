package EmployeesInfo;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiconfigs.ApiPath;
import apiconfigs.HeaderConfigs;
import baseTest.Basetest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.PostAPIPojo;
public class SerailizationTest  extends  Basetest{

	
	@Test
	 
	public void serealizationtest() {
		
		test.log(LogStatus.INFO ,"Serialization of the test is stating now");
		HeaderConfigs head = new HeaderConfigs();//to pass headers
		PostAPIPojo  pojo = new PostAPIPojo (67,"Shruti","kelkar",90);
		
		System.out.println(pojo.toString());
		 Response response =RestAssured.given().when().headers(head.defaultheaders()).body(pojo).post(ApiPath.APIPath.CREATE_USER);
		
		 
		 System.out.println(response.getBody().asString());
		 
		 System.out.println(pojo.getFirstname());

         System.out.println(pojo.getId());

		 System.out.println(pojo.getLastname());
		 
		 System.out.println(pojo.getSubjectd());
		 
		 
		 test.log(LogStatus.PASS ,"Serialization Test is passed now and working as expected");
		 
		 test.log(LogStatus.INFO ,"Serialization of the test is Ending now");
	}
	
	
	
	
}
