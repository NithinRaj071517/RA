package learn;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationGet2 {

	
	@Test
	public void get2() {
		
		RestAssured.baseURI = "https://fakestoreapi.com/Products/";		
		
		
		
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.request(Method.GET);
		response.prettyPrint();
		
		
	}
}
