package apiVerification;

import utils.ExtentReportListner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

// to validate multiple data for get and post requests
public class APIVerifications extends ExtentReportListner {
//here we are using mostly static because we want to use this in method so using static we do not need to create multiple object
	// here using response class from restassured
	public static void responseCodeValiddation(Response response, int statusCode) {

		try {
			Assert.assertEquals(statusCode, response.getStatusCode());// expected and actual result
			test.log(LogStatus.PASS,
					"Successfully validdated status code, status code is :: " + response.getStatusCode());
		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());// to get fair idea why test is failing
			test.log(LogStatus.FAIL,
					"Expected status code is :: " + statusCode + " , insted of getting :: " + response.getStatusCode());
		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}
	}

	// validatating response paticular data from response
//mostly using for get request
	public static void responsekeyValidationFromArray(Response response, String key) {
		try {
			JSONArray array = new JSONArray(response.getBody().asString());

			for (int i = 0; i < array.length(); i++) {
				// System.out.println(array.get(i));it will validate all things but in real time
				// we need to validate particular object

				// converting json array into json object

				JSONObject obj = array.getJSONObject(i);// here passing array is important otherwise it will give error

				test.log(LogStatus.PASS, "validsted valure are ::" + obj.get(key));
				// System.out.println(obj.get("FirstName"));

			}
		} catch (Exception e) {
			// to handle exception if try block fails

			test.log(LogStatus.FAIL, e.fillInStackTrace());

		}
	}

//mostly using for post request
	public static void responsekeyValidationgfromJSonOject(Response response, String key) {
		try {
			JSONObject json = new JSONObject(response.getBody().asString());// response as string we are passing
			if (json.has(key) && json.get(key) != null) // response key it is updated or not and valur is present ot not
			{
				test.log(LogStatus.PASS, "Validated value of post request od ::" + key + "it is::" + json.get(key));
			} else {
				test.log(LogStatus.FAIL, " key is not validated");
			}

		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}

	}

	// validating response time

	public static void responseTimeValidation(Response response) {

		try {
			long time = response.time();

			test.log(LogStatus.INFO, "Api response time is::" + time);
		} catch (Exception e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
		}

	}

}
