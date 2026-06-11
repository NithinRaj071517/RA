package swiss;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class InitMobile extends Baseclass {
	
	
	

	@Test
	public void initMobRequest() 
	{	
		System.out.println("<<<<<<<<<<<<<<<<<<<Request Initiation>>>>>>>>>>>>>>>>>");
		File initReqFile = new File("./src/test/java/swiss/REQUEST/INIT_MOB.json");
		
		req = RestAssured.given().contentType("application/json")
		.cookie("access_token",setupCookies())
		.when().body(initReqFile);
		
		response = req.post("/work-order");
		response.prettyPrint();
		woID = response.jsonPath().get("id");
		System.out.println(woID);
		response.then().assertThat().body("status",Matchers.equalTo("NEW"));
		
		
		
	}
}
