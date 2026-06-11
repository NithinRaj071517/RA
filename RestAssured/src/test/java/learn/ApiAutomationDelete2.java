package learn;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;




public class ApiAutomationDelete2 {

	@Test
	public  void del() {
		
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/";		
		

		RestAssured.given()
		.when().delete("/delete/3")
		.then().
		body("data", Matchers.equalTo("3"))
		.log().all();
	}
}
