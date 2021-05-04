package BasicRequests;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
//import static io.restassured.module.jsv.JsonSchemavalidator.matchesJsonSchemaInclasspath

import org.testng.annotations.Test;

public class JsonSchemavalidator {
	
	
	@Test
	public void singleuser()
	 {
		
		
		
		given().
		     get("https://reqres.in/api/users?page=2")
		     .then().
		  //   .assertThat().body(matchesJsonSchemaInClasspath("Schema.json")).
		     statusCode(200)
		     .body("data.id[2]", equalTo(2))
		    .log().all();
		     
	 }


}
