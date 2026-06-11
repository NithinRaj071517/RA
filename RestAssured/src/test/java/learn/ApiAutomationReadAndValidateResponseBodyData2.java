package learn;


import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.*;
public class ApiAutomationReadAndValidateResponseBodyData2 {

	@Test
	public void valResp() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		

		given().when().get("/products/1")
		.then()
			.body("category",Matchers.equalTo("men's clothing"))
			.body("rating.count",Matchers.equalTo(120));
		
		
		
	}

}
