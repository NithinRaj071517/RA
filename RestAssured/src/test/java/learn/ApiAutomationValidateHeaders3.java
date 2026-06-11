package learn;



import org.testng.annotations.Test;

import io.restassured.RestAssured;





public class ApiAutomationValidateHeaders3 {

	@Test
	public  void validate() {

		RestAssured.baseURI = "https://fakestoreapi.com/Products/";		


		RestAssured.given()
		.when().get()
		.then()
		.header("Content-Type", "application/json; charset=utf-8")
		.header("Connection","keep-alive");
		System.out.println("Executed");
	}
}
