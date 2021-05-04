package EmployeesInfo;




import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiVerification.APIVerifications;
import apiconfigs.ApiPath;
import baseTest.Basetest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
 
public class getAPITest  extends Basetest{

	
	@Test 
	public void  getAPITest()
	{
		//1st way
		
		
		test.log(LogStatus.INFO, "My test is started now");
	 Response response  = RestAssured.given().when().get(ApiPath.APIPath.GET_LIST_OF_USERS);
		
		APIVerifications.responseCodeValiddation( response, 200);
		APIVerifications.responsekeyValidationFromArray(response ,"FirstName");
		APIVerifications.responseTimeValidation(response);
		test.log(LogStatus.INFO, "My test is ended now");
	}	
	//@Test 
	public void  getAPITest1()
	{
		//1st way
		//RestAssured.given().when().get(ApiPath.APIPath.GET_LIST_OF_USERS).then().log().all();
		
		
		// 2nd way
		test.log(LogStatus.INFO, "My test is started executing now");
		
		
		Response response= RestAssured.given().when().get(ApiPath.APIPath.GET_LIST_OF_USERS);
		
		test.log(LogStatus.INFO, " The boday is as follow::"+response.getBody().asString());
		
		test.log(LogStatus.INFO,  "My status code is ::" +response.statusCode());
		
		
		test.log(LogStatus.INFO,  "My  response time is ::" +response.getTime());
		
				
	//	System.out.println("Body of the request is"+response.getBody().asString());//As string important to print body  
		
	//	System.out.println("Status code of the resuest is" +response.statusCode());
		
	//	System.out.println("cookies of the resuest is" +response.getCookies());
		
	//	System.out.println("Time of the resuest is"+response.getTime());
		
		
	
		
	//so here in vm argument during run configuration if we have passed incorrect env the we will get java.lang.IllegalArgumentException: baseURI cannot be null
		// so here in vm argument if in property file itself if we wrong data and we are trying to running through vm arguments will get UNknown exception error nodename or server name is failing
		
		
		
		//To validate response we need tow libraries json and  gson
		
		//json object starts with curely or flower bracket
		//json array start with square bracket
		
		//To validate json array
		JSONArray array= new  JSONArray (response.getBody().asString());//convert response in json array
		
		for(int i=0;i<array.length();i++)
		{
			//System.out.println(array.get(i));it will validate all things but in real time we need to validate particular object
			
			//converting json array into json object
			
			JSONObject obj=  array.getJSONObject(i);//here passing array is important otherwise it will give error
			
			test.log(LogStatus.INFO ,"validsted valure are ::"+obj.get("FirstName"));
		//	System.out.println(obj.get("FirstName"));
			
			test.log(LogStatus.INFO ,"Test is passed......");
			test.log(LogStatus.INFO ,"Test have been ended......");
			
		}
		
	}	
	
	
	
}
