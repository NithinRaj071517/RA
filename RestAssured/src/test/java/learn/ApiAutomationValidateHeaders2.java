package learn;

import io.restassured.RestAssured;




public class ApiAutomationValidateHeaders2 {

	public static void main(String[] args) {
	
		RestAssured.given()
		.when().get("https://fakestoreapi.com/Products/")
		.then().log().headers();
	}
}
