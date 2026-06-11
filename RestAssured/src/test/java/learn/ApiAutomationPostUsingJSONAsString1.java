 package learn;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiAutomationPostUsingJSONAsString1 {

	@Test
	public void postUsingJsonString()
	{
		String bodyString="{\r\n"
				+ "  \"id\": 23,\r\n"
				+ "  \"title\": \"Nithn\",\r\n"
				+ "  \"price\": 0.5,\r\n"
				+ "  \"description\": \"string\",\r\n"
				+ "  \"category\": \"string\",\r\n"
				+ "  \"image\": \"http://examplssse.com\"\r\n"
				+ "}";
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON).body(bodyString);
		Response resp = req.post("/products");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
}
