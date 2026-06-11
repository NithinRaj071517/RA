package learn;


import io.restassured.RestAssured;


public class ApiAutomationReadResponseBody2 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		

		RestAssured.given()
		.when().get("/products")
		.then().log().body();
		
		
		
	}
}
