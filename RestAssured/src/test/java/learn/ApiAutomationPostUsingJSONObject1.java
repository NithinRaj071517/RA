 package learn;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class ApiAutomationPostUsingJSONObject1 {

	@Test
	public void postUsingJsonString()
	{
		JSONObject jsonpObject = new JSONObject();
		jsonpObject.put("id", "33");
		jsonpObject.put("title","dsd");
		jsonpObject.put("price","0.9");
		jsonpObject.put("description","0.9");
		jsonpObject.put("category","0.9");
		jsonpObject.put("image","http://example.com");
		
		
		RestAssured.baseURI="https://fakestoreapi.com";
		
		RequestSpecification req = RestAssured.given().contentType(ContentType.JSON).body(jsonpObject.toString());
		Response resp = req.post("/products");
		resp.prettyPrint();
		
		int statusCode = resp.statusCode();
		Assert.assertEquals(statusCode, 201);
		
	}
}
