package BasicRequests;
import org.testng.Assert;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test01_Get {

	
	@Test
	void BasicGetdata()
	{
	// Response response =RestAssured.get("https://reqres.in/api/users?page=2");
		//response is the class of the response
		
		 Response response = get("https://reqres.in/api/users?page=2");
	//due to staic  imports of rest assured here no need to right rest assured  io jars
		 response.getStatusCode();
		 response.getBody();
		 System.out.println(response.asString());
		 System.out.println(response.getBody().asString());
		 System.out.println(response.getStatusCode());
		 System.out.println(response.getStatusLine());
		 System.out.println(response.getHeader("Content-type"));
		 System.out.println(response.getTime());
		
		//TO fail 
		 int statuscode = response.getStatusCode();
		 Assert.assertEquals(statuscode, 200);
	} 
	
	@Test
	void testwithgiven()
	{
		given()
		.get("https://reqres.in/api/users?page=2")
		.then().statusCode(200)
		.body("data.id[0]",equalTo(7));
	}
	
	
}
