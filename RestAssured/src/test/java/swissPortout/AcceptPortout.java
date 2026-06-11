package swissPortout;



import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class AcceptPortout extends Baseclass {
	
	
	

	@Test(dependsOnMethods ="swissPortout.GetPortoutRequest.getPortoutRequest")
	public void acceptRequest() 
	{	
		System.out.println("<<<<<<<<<<<<<<<<<<<Accept the  Request>>>>>>>>>>>>>>>>>");
		req = RestAssured.given().contentType("application/json")
		.cookie("access_token",setupCookies())
		.when().body("");
		
		response = req.put("/work-order/"+woID.get(0)+"/accept");
		response.prettyPrint();
		
		response.then().assertThat().body("status",Matchers.equalTo("ACCEPT"));
		
		
	}
}
