 package learn;


import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ApiAutomationPostUsingJSONAsString2 {

	@Test
	public void postUsingJsonString()
	{
		String bodyString="{\r\n"
				+ "  \"id\": 23,\r\n"
				+ "  \"title\": \"Nithn\",\r\n"
				+ "  \"price\": 0.5,\r\n"
				+ "  \"description\": \"string\",\r\n"
				+ "  \"category\": \"string\",\r\n"
				+ "  \"image\": \"http://exasssmplssse.com\"\r\n"
				+ "}";
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(bodyString)
		.when().post("/products")
		.then().log().all();
		
	}
}
