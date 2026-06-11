 package learn;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationDelete1 {

	@Test
	public void deleteUser() {
		
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/";		
		
		/** Type 1 **/
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.delete("/delete/2");
		response.prettyPrint();

		int statusCode = response.statusCode();
		Assert.assertEquals(statusCode, 200);
		
		
	}
}
