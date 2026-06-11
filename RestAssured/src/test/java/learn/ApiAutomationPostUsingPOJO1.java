 package learn;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import testdata.POJOProductRequest;



public class ApiAutomationPostUsingPOJO1 {

	@Test
	public void postUsingJsonString()
	{
		POJOProductRequest prod=new POJOProductRequest();
		prod.setId("33");
		prod.setTitle("Rock");
		prod.setPrice("0.7");
		prod.setDescription("Test");
		prod.setCategory("cat-B");
		prod.setImage("http://googlr.com");
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON).body(prod);
		Response resp = req.post("/products");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
}
