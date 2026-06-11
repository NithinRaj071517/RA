package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteIncident {

	
	@Test
	public void delIncident() 
	{
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.authentication=RestAssured.basic("admin","d-J+lC2Hk7A");
		RequestSpecification bodyRequest = RestAssured.
				given().contentType("application/json");				
		Response response = bodyRequest.delete("/delete/7");
		response.prettyPrint();
		String str = response.jsonPath().get("status");
		String str1 = response.jsonPath().get("data");
		String mes=response.jsonPath().get("message");
		int res=response.statusCode();
		System.out.println(str);
		System.out.println(str1);
		System.out.println(mes);
		System.out.println(res);
	}
}
