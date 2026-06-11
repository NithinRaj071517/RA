package learn;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class ApiAutomationDigestAuth2 {

	@Test
	public void basicAuth () 
	{
		
		RestAssured.baseURI = "https://postman-echo.com/digest-auth";		
		

		RestAssured.given().auth().digest("postman", "password")
		.when().get()
		.then()
		.statusCode(200)
		.body("authenticated",Matchers.equalTo(true));
	}
}
