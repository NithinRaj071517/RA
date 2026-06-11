package learn;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class ApiAutomationValidateHeaders4 {
@Test
public void val() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		RequestSpecification givReq = RestAssured.given();
		
		Response response = givReq.get("/Products/1");
	
		
		System.out.println("<!----------------Specific header--->");
		System.out.println(response.getHeader("Server"));
		System.out.println(response.getHeader("Content-Type"));
		String encod = response.getHeader("Content-Encoding");
		
		Assert.assertEquals(encod, "gzip");
		
	}
}
