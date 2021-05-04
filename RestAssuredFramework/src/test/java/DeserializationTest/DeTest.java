package DeserializationTest;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import DeserializingPOJO.DataPOJO;
import DeserializingPOJO.LIistUserPOJO;
import io.restassured.RestAssured;
import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class DeTest extends ExtentReportListner {

	@Test
	public void Deset() {

		test.log(LogStatus.INFO, "Deserialization test is sarting soon");

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";

		// LIistUserPOJO pojo= new LIistUserPOJO();//if we do in this way we are getting
		// values as null

		LIistUserPOJO pojo = RestAssured.given().when().get().as(LIistUserPOJO.class);

		// System.out.println(pojo.toString());//it will give us proper output
		System.out.println(pojo.getData());// it will access list

		List<DataPOJO> list = pojo.getData();

		for (int i = 0; i < list.size(); i++) {

			test.log(LogStatus.INFO," This my first element "+i+ "Element is"+list.get(i));
			System.out.println("This my first element "+i+ "Element is"+list.get(i));
		}

		test.log(LogStatus.PASS, "Deserialization test is working as expected now");

		test.log(LogStatus.INFO, "Deserialization test is Ended now");

	}

}
