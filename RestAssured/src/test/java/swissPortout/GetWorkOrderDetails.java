package swissPortout;



import org.hamcrest.Matchers;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class GetWorkOrderDetails extends Baseclass {

	@Test(dependsOnMethods ="swissPortout.AcceptPortout.acceptRequest")
	public void getWODetails() 
	{
		System.out.println("<<<<<<<<<<<<<<<<<<<Get Details>>>>>>>>>>>>>>>>>");
		req = RestAssured.given().contentType("application/json").
				cookie("access_token",setupCookies())
		.when().body("");
		
		response = req.get("/work-order/"+woID);
		
		response.prettyPrint();
		String getWOID = response.jsonPath().get("id");
		System.out.println(getWOID);
		
		//int statusCode = response.getStatusCode();
		//Assert.assertEquals(statusCode, 200);  -- TestNG assert
		
		
		response.then().assertThat().statusCode(Matchers.equalTo(200));
		response.then().assertThat().body("smsDeparture.status",Matchers.containsStringIgnoringCase("missing"));
		response.then().assertThat().body("status",Matchers.equalTo("CANCEL"));

		
		
	}
}
