package BasicRequests;

import java.util.HashMap;
import static  io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Test_post {
	
	@Test
	public void PostData()
	{
		//body created
		//passing json in map but we need to use gson or jackdson or json or json simple
//		Map<String ,Object> map =  new HashMap<String ,Object>();
//		
//		map.put("name", "Ankita");
//		map.put("job", "Qa");
//		System.out.println(map);
		
		//withput map
		JSONObject request =  new  JSONObject ();
		request.put("name", "Ankita");
		request.put("job", "Qa");
		System.out.println(request);
//  if seralization error occurs 
		System.out.println(request.toJSONString());
		

		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).log().all()
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201).log().all();
		
		}
	
	@Test
	public void PutData()
	{
		//body created
		//passing json in map but we need to use gson or jackdson or json or json simple
//		
		
		
		JSONObject request =  new  JSONObject ();
		
		request.put("name", "Ankita");
		request.put("job", "Qa");
		System.out.println(request);
//  if seralization error occurs 
		System.out.println(request.toJSONString());
		

		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).log().all()
		.when()
		.put("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
	}

	@Test
	public void PatchData()
	{
		//body created
		//passing json in map but we need to use gson or jackdson or json or json simple
//		
		
		
		JSONObject request =  new  JSONObject ();
		
		request.put("name", "Ankita");
		request.put("job", "Qa");
		System.out.println(request);
//  if seralization error occurs 
		System.out.println(request.toJSONString());
		

		given().
		header("Content-Type","application/json").
		body(request.toJSONString()).log().all()
		.when()
		.patch("https://reqres.in/api/users/2")
		.then()
		.statusCode(200).log().all();
		
		
}
	 
			
			@Test
			public void DeleteData()
			{
				
				when()
				.delete("https://reqres.in/api/users/2")
				.then()
				.statusCode(204).log().all();
				
				
}
}