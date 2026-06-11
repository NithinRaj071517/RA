 package learn;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationGet1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		/** Type 1 **/
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.get("/Products/7");
		response.prettyPrint();
		
		
		
	}
}
