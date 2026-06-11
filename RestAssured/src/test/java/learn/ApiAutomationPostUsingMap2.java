 package learn;


import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ApiAutomationPostUsingMap2 {

	@Test
	public void postUsingJsonString()
	{

		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("id", "33");
		map.put("title","sdaf");
		map.put("price","0.9");
		map.put("description","0.9");
		map.put("category","0.9");
		map.put("image","http://examsssple.com");
		
		RestAssured.baseURI="https://fakestoreapi.com/";
		RestAssured.given().
		contentType("application/json")
		.body(map)
		.when().post("/products")
		.then().log().all();
		
	}
}
