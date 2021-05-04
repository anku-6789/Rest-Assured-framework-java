package BasicRequests;



import java.util.HashMap;
import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_delete {
	
	@Test
	public void DeleteData()
	{
		
		when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.statusCode(204).log().all();
		
		
}
}