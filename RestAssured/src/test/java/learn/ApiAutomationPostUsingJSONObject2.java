 package learn;


import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ApiAutomationPostUsingJSONObject2 {

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
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(jsonpObject.toString())
		.when().post("/products")
		.then().log().all();
		
	}
}
