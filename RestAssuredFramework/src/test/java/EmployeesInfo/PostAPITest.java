package EmployeesInfo;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import apibuilder.PostApBuilder;
import apiconfigs.ApiPath;
import apiconfigs.ApiPath.APIPath;
import apiconfigs.HeaderConfigs;
import baseTest.Basetest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostAPITest extends Basetest {

	// we have created headers as seperate class so we need to create a

	@Test
	public void validPostApiRequest() {

		HeaderConfigs head = new HeaderConfigs();
		PostApBuilder builder = new PostApBuilder();

		// to gerenrate random id

		Random random = new Random();
		int randomNo = random.nextInt(100);// here we are passing id as string so we need to change
		String id = Integer.toString(randomNo);

		//random string values
		 String randomFirstname=RandomStringUtils.randomAlphabetic(3);
		
		//random string values
		 String randomLastname=RandomStringUtils.randomAlphabetic(5);
		
		 
		// to gerenrate random subjectid

			Random randomSubjectid = new Random();
			int randomNo1 = randomSubjectid.nextInt(100);// here we are passing id as string so we need to change
			String Subjectid = Integer.toString(randomNo1);
			
			
			System.out.println("Random user id created is ::"+randomNo+"Random Firstname of the user is created as ::"+randomFirstname+ "Random last name of the user created as ::"+randomLastname+"random subject id created for the user is ::"+randomNo1);
			
		Response response = RestAssured.given().when().headers(head.defaultheaders()).body(builder.postrequestbody(id,randomFirstname,randomLastname,Subjectid))
				.when().post(ApiPath.APIPath.CREATE_USER);

		System.out.println(response.getBody().asString());
		System.out.println(response.statusCode());
		System.out.println(response.getTime());

	}

}
