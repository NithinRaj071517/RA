package learn;

import org.testng.Assert;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationValidateResponseCode1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.get("/Products");
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		
		Assert.assertEquals(statusCode, 200);
		
		
		
	}
}
