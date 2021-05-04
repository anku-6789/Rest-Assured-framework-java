package BasicRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.* ;

public class SoapXmlRequest {

	
	
	@Test
	 public void SoapXmlvalidated()
	 {
		RestAssured.baseURI="https://ecs.syr.edu/faculty/fawcett/Handouts/cse775/code/calcWebService/";
		
		//given().contentType("text/xml")
		//.accept(ContentType.XML)
		//.body(null)
	}
	
}
