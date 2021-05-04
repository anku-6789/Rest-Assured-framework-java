package baseTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import io.restassured.RestAssured;
import utils.ExtentReportListner;
import utils.FileAndEnv;

@Listeners(ExtentReportListner.class)
public class Basetest  extends ExtentReportListner{

	
	
	@BeforeClass
	 public void  baseTest(){
		
		// RestAssured.baseURI="http://localhost:3000/";// here its like a hardcoding we do not want to hardcode this value so
		
		
		
		RestAssured.baseURI=FileAndEnv.envAndFile().get("ServerUrl");
		
		System.out.println(FileAndEnv.envAndFile().get("ServerUrl"));
		
	 }

	
}