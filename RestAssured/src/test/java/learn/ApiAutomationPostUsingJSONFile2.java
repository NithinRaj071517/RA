 package learn;


import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ApiAutomationPostUsingJSONFile2 {

	@Test
	public void postUsingJsonString()
	{
	
		File file = new File("./src/test/resources/product.json");
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(file)
		.when().post("/products")
		.then().log().all();
		
	}
}
