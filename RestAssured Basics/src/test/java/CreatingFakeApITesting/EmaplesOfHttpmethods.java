package CreatingFakeApITesting;
import java.util.HashMap;
import static  io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class EmaplesOfHttpmethods {
	
	
	
	//@Test
	public void test_get()
	{
		
		baseURI ="http://localhost:3000/";
		
		
		given().param("name", "mayur")
		.get("/users")
	.then()
		.statusCode(200).log().all();
		
		}
	
	@Test
	public void test_post()
{
		
		JSONObject request = new JSONObject();
		
		request.put("id", "8");
		request.put("FirstName", "Neha");
		request.put("LastName", "more");
		request.put("SubjectId", "8");
		
		baseURI ="http://localhost:3000/";
		
		
		 given()
		 .contentType(ContentType.JSON)
		 .accept(ContentType.JSON)
		 .header("Content-Type,", "application/json")
		 .body(request.toJSONString()).log().all()
		 .when()
		 .post("users")
		.then()
		.statusCode(201)
		.log().all();
		
		}
	
	//@Test
	public void test_patch()
{
		
		JSONObject request = new JSONObject();
		
		request.put("LastName", "patil");
		
	
		baseURI ="http://localhost:3000/";
		 given()
		 .contentType(ContentType.JSON).accept(ContentType.JSON)
		 .header("ContentType,", "application/json")
		 .body(request.toJSONString())
		 .when()
		 .patch("/users/4")
		.then()
		 .statusCode(200).log().all();
		
		
		}
	//@Test
		public void test_put()
	{
			
			JSONObject request = new JSONObject();
			request.put("FirstName", "megha");
			request.put("LastName", "jain");
			request.put("SubjectId", 11);
			request.put("ID", 12);
		
			baseURI ="http://localhost:3000/";
			 given()
			 .contentType(ContentType.JSON).accept(ContentType.JSON)
			 .header("ContentType,", "application/json")
			 .body(request.toJSONString())
			 .when()
			 .put("/users")
			.then()
			 .statusCode(200)
			 .log().all();
			
			}

		

//@Test
	public void test_delete()
{
		
		baseURI ="http://localhost:3000/";
		 given()
		.
		 
		 when()
		 .delete("/users/2")
		.then()
		 .statusCode(200).log().all();
		
		}
}
