package DataDriven;

import static io.restassured.RestAssured.when;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Deleteparameterization {

	@DataProvider(name="Delete")
	public Object[] datafordelete()
	{
		return new Object []
				{
					54,384	
				};
	
	}
	
	@Test(dataProvider="Delete")
	public void DeleteData(int userid)
	{
		
		when()
		.delete("https://reqres.in/api/users/2"+userid)
		.then()
		.statusCode(204).log().all();
	}	

}
