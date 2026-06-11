 package learn;


import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ApiAutomationPutUsingJSONObject2 {

	@Test
	public void postUsingJsonString()
	{
		JSONObject jsonpObject = new JSONObject();
		jsonpObject.put("id", "33");
		jsonpObject.put("title","dsd");
		jsonpObject.put("price","0.19");
		jsonpObject.put("description","zxz");
		jsonpObject.put("category","Mobile");
		jsonpObject.put("image","http://example.com");
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(jsonpObject.toString())
		.when().put("/products/2")
		.then().log().all();
		
	}
}
