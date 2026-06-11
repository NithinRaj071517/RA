package serializationAndDeserialization;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import testdata.User;

public class RestAssuredSerialization {

	
	@Test
	public void serializationExample()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		//Creating a new user using User POJO
		User user=new User();
		user.setName("Nithin");
		user.setEmail("niti@gmail.com");
		
		RestAssured.given()
					.contentType(ContentType.JSON)
					.body(user)  //Serialization Converting "user" POJO to JSON
					.when().post("/users")
					.then().statusCode(201).log().body();
	}
}
