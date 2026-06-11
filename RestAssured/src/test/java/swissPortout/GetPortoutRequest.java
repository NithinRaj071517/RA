package swissPortout;




import java.util.HashMap;


import org.hamcrest.Matchers;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GetPortoutRequest extends Baseclass {

	@Test
	public void getPortoutRequest() 
	{
		HashMap<String,String> queryParameters=new HashMap<String,String>();
		queryParameters.put("status", "NEW");
		queryParameters.put("donorId", "98095");
		
		System.out.println("<<<<<<<<<<<<<<<<<<<Get Portout Request>>>>>>>>>>>>>>>>>");
		req = RestAssured.given().contentType("application/json").
				cookie("access_token",setupCookies()).queryParams(queryParameters)
		.when().body("");
		
		response = req.get("/work-order/");
		response.prettyPrint();
		
		woID = response.jsonPath().get("id");
	
		System.out.println(woID.get(0));
		
		

		response.then().assertThat().statusCode(Matchers.equalTo(200));
		response.then().assertThat().body("status",Matchers.hasItem("NEW"));

		
		
	}
}
