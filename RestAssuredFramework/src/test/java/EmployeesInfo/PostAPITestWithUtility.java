package EmployeesInfo;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiVerification.APIVerifications;
import apibuilder.PostApBuilder;
import apiconfigs.ApiPath;
import apiconfigs.ApiPath.APIPath;
import apiconfigs.HeaderConfigs;
import baseTest.Basetest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.JavaUtils;

public class PostAPITestWithUtility extends Basetest {

	// we have created headers as seperate class so we need to create a

	@Test
	public void validPostApiRequest() {

		test.log(LogStatus.INFO, "My post request test is starting now");
		
		HeaderConfigs head = new HeaderConfigs();
		PostApBuilder builder = new PostApBuilder();

		// JavaUtils java= new JavaUtils();

		// so here we are used that method with class reference
		Response response = RestAssured.given().when().headers(head.defaultheaders())
				.body(builder.postrequestbody(JavaUtils.randomNo(), JavaUtils.randomFirstName(),
						JavaUtils.randomLastName(), JavaUtils.randomSubjectid()))
				.when().post(ApiPath.APIPath.CREATE_USER);

		// her we have created a object of javaUtils class and by assinging that obje we
		// are passing the parameters
//Response response = RestAssured.given().when().headers(head.defaultheaders()).body(builder.postrequestbody(java.randomNo(),java.randomFirstName(),java/.randomLastName(),java.randomSubjectid()))
//	.when().post(ApiPath.APIPath.CREATE_USER);

		APIVerifications.responsekeyValidationgfromJSonOject(response, "LastName");

		APIVerifications.responseCodeValiddation(response, 201);

		APIVerifications.responseTimeValidation(response);

		test.log(LogStatus.INFO, "MY post request test is ended now");
	}
}