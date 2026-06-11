package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncident {

	
	@Test
	public void incident() 
	{
		
		//Endpoint URL
		RestAssured.baseURI="https://openai-mock.mock.beeceptor.com";
		
		//Authentication
		
		RestAssured.authentication=RestAssured.basic("admin","d-J+lC2Hk7A");
		
		
		//Add Request
		RequestSpecification bodyRequest = RestAssured.
		given().contentType("application/json")
		.when()	.body("");
		
		//Send Request
		Response response = bodyRequest.get("/assistants");
		response.prettyPrint();
	}
}
