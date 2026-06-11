package learn;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class ApiAutomationBasicAuth2 {

	@Test
	public void basicAuth () 
	{
		
		RestAssured.baseURI = "https://postman-echo.com/basic-auth";		
		

		RestAssured.given().auth().basic("postman", "password")
		.when().get()
		.then()
		.statusCode(200)
		.body("authenticated",Matchers.equalTo(true));
	}
}
