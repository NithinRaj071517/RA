package learn;



import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import io.restassured.specification.RequestSpecification;

public class ApiAutomationValidateHeaders1 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://fakestoreapi.com";		
		RequestSpecification givReq = RestAssured.given();
		
		Response response = givReq.get("/Products");
		
		Headers headers = response.headers();
		
		for(Header head:headers)
		{
			System.out.println(head.getName()+"--->"+head.getValue());
		}
		
		System.out.println("<!----------------Specific header--->");
		System.out.println(response.getHeader("Server"));
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getHeader("Content-Encoding"));
		
	}
}
