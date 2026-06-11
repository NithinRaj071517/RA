package week3.day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithStringBody {

	
	@Test
	public void postFileIncident() 
	{
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.authentication=RestAssured.basic("admin","d-J+lC2Hk7A");
		
		File reqfile = new File("./src/test/resources/req.json");
		
		RequestSpecification bodyRequest = RestAssured.
				given().contentType("application/json")
				.when()	.body(reqfile); 
		Response response = bodyRequest.post("/create");
		response.prettyPrint();
		String str = response.jsonPath().get("status"); 
		String str1 = response.jsonPath().get("data.name");
		System.out.println(str);
		System.out.println(str1);
	}
}
