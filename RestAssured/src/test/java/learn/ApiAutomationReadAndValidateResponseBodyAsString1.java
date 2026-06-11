package learn;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationReadAndValidateResponseBodyAsString1 {

	@Test
	public void valRespBody() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.get("/Products");
		
		String resp = response.getBody().asString();
		System.out.println(resp);
		
		Assert.assertTrue(resp.contains("jewelery"));
		
	}
}
