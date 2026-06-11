package serializationAndDeserialization;



import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;

import testdata.User;

public class RestAssuredDeSerialization {

	
	@Test
	public void serializationExample()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		
		//Sending GET request  to fetch details
		 Response response = RestAssured.given().get("/users/11");
		 
		 
		 //Deserialization  the JSON response to the User POJO
		 User fetchedResp = response.as(User.class);
		 
		 System.out.println(fetchedResp.getName());
		 System.out.println(fetchedResp.getId());
		 System.out.println(fetchedResp.getEmail());
	
	}
}
