package learn;


import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationReadResponseBody1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.get("/Products");
		
		String asString = response.getBody().asString();
		System.out.println(asString);
		
		
		
	}
}
