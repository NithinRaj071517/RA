package swiss;



import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class CancelInit extends Baseclass {
	
	
	

	@Test(dependsOnMethods ="swiss.InitMobile.initMobRequest")
	public void cancelRequest() 
	{	
		System.out.println("<<<<<<<<<<<<<<<<<<<Cancel Initiation>>>>>>>>>>>>>>>>>");
		req = RestAssured.given().contentType("application/json")
		.cookie("access_token",setupCookies())
		.when().body("");
		
		response = req.put("/work-order/"+woID+"/cancel");
		response.prettyPrint();
		
		response.then().assertThat().body("status",Matchers.equalTo("CANCEL"));
		
		
	}
}
