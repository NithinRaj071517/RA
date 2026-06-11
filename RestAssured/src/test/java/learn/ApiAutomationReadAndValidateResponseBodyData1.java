package learn;



import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationReadAndValidateResponseBodyData1 {

	@Test
	public void valRespBody() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		
		
		RequestSpecification givReq = RestAssured.given();
		Response response = givReq.get("/Products/1");
		
		JsonPath jsonPath = response.jsonPath();
		String string = jsonPath.getString("title");
		String string1 =jsonPath.getString("price");
		System.out.println(string+"     "+string1);
		
		Assert.assertEquals(string1,"109.95");
	}
}
