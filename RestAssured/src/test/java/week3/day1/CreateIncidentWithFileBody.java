package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentWithFileBody {

	
	@Test
	public void postIncident() 
	{
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
		RestAssured.authentication=RestAssured.basic("admin","d-J+lC2Hk7A");
		RequestSpecification bodyRequest = RestAssured.
				given().contentType("application/json")
				.when()	.body("{\r\n"
						+ "    \"name\": \"te444st\",\r\n"
						+ "    \"salary\": \"12443\",\r\n"
						+ "    \"age\": \"43\"\r\n"
						+ "}"); 
		Response response = bodyRequest.post("/create");
		response.prettyPrint();
		String str = response.jsonPath().get("status");
		String str1 = response.jsonPath().get("data.name");
		System.out.println(str);
		System.out.println(str1);
	}
}
