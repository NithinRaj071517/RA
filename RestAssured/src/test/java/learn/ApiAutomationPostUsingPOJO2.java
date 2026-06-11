 package learn;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import testdata.POJOProductRequest;



public class ApiAutomationPostUsingPOJO2 {

	@Test
	public void postUsingJsonString()
	{
		POJOProductRequest prod=new POJOProductRequest();
		prod.setId("33");
		prod.setTitle("Rock");
		prod.setPrice("0.7");
		prod.setDescription("Test");
		prod.setCategory("cat-C");
		prod.setImage("http://googlr.com");
		
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(prod)
		.when().post("/products")
		.then().log().all();
		
	}
}
