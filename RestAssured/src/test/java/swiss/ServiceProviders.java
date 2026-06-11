package swiss;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class ServiceProviders extends Baseclass {

	@Test
	public void getAllSP() 
	{
		RestAssured.baseURI="https://ws.testsrv.numberportability.ch/inetref/api";
		
		
		req = RestAssured.given().contentType("application/json").
				cookie("access_token",setupCookies())
		.when().body("");
		
		
		response = req.get("/telecom-service-provider");
		
		response.prettyPrint();
		//response.jsonPath().get()
		response.then().assertThat().body("address.city",Matchers.hasItem("Bern"));
		
		
		
	}
}
