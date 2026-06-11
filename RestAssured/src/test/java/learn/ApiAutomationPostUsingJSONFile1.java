 package learn;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiAutomationPostUsingJSONFile1 {

	@Test
	public void postUsingJsonString()
	{
		
		File file = new File("./src/test/resources/product.json");
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON).body(file);
		Response resp = req.post("/products");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
}
