package learn;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class ApiAutomationDigestAuth1 {

	@Test
	public void basicAuth () 
	{
		
		RestAssured.baseURI = "https://postman-echo.com/digest-auth";		
		

		RequestSpecification givReq = RestAssured.given();
		givReq.auth().digest("postman","password");
		Response response = givReq.get("");
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		String string = jsonPath.getString("authenticated");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(string,"true");
	}
}
