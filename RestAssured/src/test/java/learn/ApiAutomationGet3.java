package learn;

import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class ApiAutomationGet3 {

	
	@Test
	public  void get3() {
		
		RestAssured.baseURI = "https://fakestoreapi.com/Products";		
		

		RestAssured.given()
		.when().get("/2")
		.then().log().all();
	}
}
