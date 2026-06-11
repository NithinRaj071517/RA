package learn;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;


public class ApiAutomationJsonSchemaValidation {

	
	@Test
	public void schema()
	{
		RestAssured.given()
		.when().get("https://fakestoreapi.com/products")
		.then()
			.assertThat()
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("sampleSchema.json"));
	}
}
