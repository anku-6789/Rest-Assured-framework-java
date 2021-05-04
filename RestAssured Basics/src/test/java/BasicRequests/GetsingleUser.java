package BasicRequests;

import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class GetsingleUser {
	
	@Test
	public void singleuser()
	 {
		
		
		
		given().
		     get("https://reqres.in/api/users?page=2")
		     .then()
		     .statusCode(200)
		     .body("data.id[2]", equalTo(2))
		    .log().all();
		     
	 }

}
