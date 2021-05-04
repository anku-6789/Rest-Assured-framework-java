package baseTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import utils.ExtentReportListner;
import utils.FileAndEnv;


@Listeners(ExtentReportListner.class)//its necessary to called listners whenever we are using externt report before performing any action
public class Forpractice  extends ExtentReportListner{

	@Test
	public void UtilTest() {

		int a =10;
		int b=20;
		
		int sum = a+b;
		
		// to check weather  we are able to fetch particular env file or not
		//System.out.println(FileAndEnv.envAndFile().get("ServerUrl")); this will fetch only server url
		System.out.println(FileAndEnv.envAndFile());
		
		
		//to check weather we are able to test extent reports or not
		
		test.log(LogStatus.INFO, "Here it will inform that test have been started");// here we get null pointer exception becasue we have to call listner
		test.log(LogStatus.PASS, "Here it will inform that test is passed");
		
		test.log(LogStatus.PASS, "the addition of two no is"+sum);
		test.log(LogStatus.FAIL, "the addition of two no is"+sum);
		
		test.log(LogStatus.INFO, "test has been completed");
		
		
	}
//here to run this we need to• run as configuration in• test tab •we need to select particular package then particular class t•hen under argument sections we need to type -Denv = value that is qa and dev under vm text feild
}
