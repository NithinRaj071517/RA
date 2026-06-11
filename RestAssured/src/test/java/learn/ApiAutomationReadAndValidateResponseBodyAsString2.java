package learn;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class ApiAutomationReadAndValidateResponseBodyAsString2 {

	@Test
	public void valResp() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		

		String asString = given().when().get("/products").getBody().asString();
		System.out.println(asString);
		Assert.assertTrue(asString.contains("jewelery"));
		
		
		
	}

}
