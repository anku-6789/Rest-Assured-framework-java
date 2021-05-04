package DataDriven;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parametrization extends DataFortest{
	
	
	
	
	
	//@Test(dataProvider="AdditionOfPeople")
	public void PostData(String Firstname,String role)
	{
	
		
		//withput map
		JSONObject request =  new  JSONObject ();
		request.put("name", Firstname);
		request.put("job", role);
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
	
	//@DataProvider(name="DeletingnOfPeople")
	public Object[] datafordelete()
	{
		return new Object []
				{
					159 ,342	
				};
	
	}
	
	//@Test(dataProvider="DeletingnOfPeople")
	public void DeleteData(int userid)
	{
		
		when()
		.delete("https://reqres.in/api/users/2"+userid)
		.then()
		.statusCode(204).log().all();
		

	}	
	
	
	@Test
	public void DeleteData2(int userid)
	{
		
		when()
		.delete("https://reqres.in/api/users/2"+userid)
		.then()
		.statusCode(204).log().all();
	}	
}
	


