package learn;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class ApiAutomationBasicAuth1 {

	@Test
	public void basicAuth () 
	{
		
		RestAssured.baseURI = "https://postman-echo.com/basic-auth";		
		

		RequestSpecification givReq = RestAssured.given();
		givReq.auth().basic("postman","password");
		Response response = givReq.get("");
		int statusCode = response.getStatusCode();
		
		Assert.assertEquals(statusCode,200);
	}
}
