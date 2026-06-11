 package learn;



import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiAutomationPostUsingMap1 {

	@Test
	public void postUsingJsonString()
	{
		
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("id", "33");
		map.put("title","sdaf");
		map.put("price","0.9");
		map.put("description","0.9");
		map.put("category","0.9");
		map.put("image","http://example.com");
		
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON).body(map);
		Response resp = req.post("/products");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
}
