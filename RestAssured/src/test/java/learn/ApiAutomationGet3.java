package learn;

import io.restassured.RestAssured;




public class ApiAutomationGet3 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com/Products";		
		

		RestAssured.given()
		.when().get()
		.then().log().all();
	}
}
